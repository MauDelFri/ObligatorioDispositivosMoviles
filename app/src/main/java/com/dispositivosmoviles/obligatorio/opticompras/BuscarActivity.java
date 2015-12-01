package com.dispositivosmoviles.obligatorio.opticompras;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

import Entidades.AdaptadorArticulo;
import Entidades.Articulo;

public class BuscarActivity extends Activity implements SearchView.OnQueryTextListener {

    ListView userList;
    AdaptadorArticulo userAdapter;
    ArrayList<Articulo> userArray = new ArrayList<Articulo>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        /**
         * add item in arraylist
         */ //nf
        Articulo a1 = new Articulo();
        a1.setId(1);
        a1.setNombre("Piza");
        a1.setPrecio(120);
        userArray.add(a1);
        Articulo a2 = new Articulo();
        a2.setId(2);
        a2.setNombre("Arco");
        a2.setPrecio(1234);
        userArray.add(a2);
        Articulo a3 = new Articulo();
        a3.setId(3);
        a3.setNombre("Bola");
        a3.setPrecio(149);
        userArray.add(a3);

        /**
         * set item into adapter
         */
        userAdapter = new AdaptadorArticulo(BuscarActivity.this, R.layout.row,
                userArray);
        userList = (ListView) findViewById(R.id.listView);
        userList.setItemsCanFocus(false);
        userList.setAdapter(userAdapter);
        /**
         * get on item click listener
         */
        userList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    final int position, long id) {
                Log.i("List View Clicked", "**********");
                Toast.makeText(BuscarActivity.this,
                        "List View Clicked:" + position, Toast.LENGTH_LONG)
                        .show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem searchItem = menu.findItem(R.id.searchView);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(BuscarActivity.this);
        return false;
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}
