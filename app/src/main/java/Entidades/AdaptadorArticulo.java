package Entidades;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.dispositivosmoviles.obligatorio.opticompras.R;

import java.util.ArrayList;

/**
 * Created by Christian on 30/11/2015.
 */
public class AdaptadorArticulo extends ArrayAdapter<Articulo> {
    Context context;
    int layoutResourceId;
    ArrayList<Articulo> data = new ArrayList<Articulo>();

    public AdaptadorArticulo(Context context, int layoutResourceId,
                             ArrayList<Articulo> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }
//fnma
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ContenedorArticulo holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new ContenedorArticulo();
            holder.textName = (TextView) row.findViewById(R.id.txtViewNombre);
            holder.btnDelete = (ImageButton) row.findViewById(R.id.btnBorrar);
            row.setTag(holder);
        } else {
            holder = (ContenedorArticulo) row.getTag();
        }
        Articulo art = data.get(position);
        holder.textName.setText(art.getNombre());

        holder.btnDelete.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Log.i("Delete Button Clicked", "**********");
                Toast.makeText(context, "Delete button Clicked"+position,
                        Toast.LENGTH_LONG).show();
                data.remove(position);
                notifyDataSetChanged();
                //((ListView) v.findViewById(R.id.listView)).removeViewAt(position);

            }
        });
        return row;

    }

    static class ContenedorArticulo {
        TextView textName;
        ImageButton btnDelete;
    }
}
