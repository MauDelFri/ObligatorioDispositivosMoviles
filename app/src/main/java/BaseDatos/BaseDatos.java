package BaseDatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import static BaseDatos.ConstantesBD.*;
import static android.provider.BaseColumns._ID;

/**
 * Created by Mauricio on 04/10/2015.
 */
public class BaseDatos extends SQLiteOpenHelper {
    public static final String Nombre_Base = "OptiCompras.db";
    public static final int Version_Base = 1;
    //public static final String[] FROM = {_ID, Nombre_Marcador, Latitud, Longitud};

    public BaseDatos(Context ctx){
        super(ctx, Nombre_Base, null, Version_Base);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create Table " + Tabla_Preferencias + " (" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + Preferencias_CantidadLocales + " INTEGER, " +
                Preferencias_ModoBusqueda + " Text, " + Preferencias_TipoLocal + " Text);");
        db.execSQL("Create Table " + Tabla_Usuarios + " (" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + Usuarios_Nombre + " Text, " + Usuarios_Password + " Text, " +
                Usuarios_IdPreferencias + " INTEGER);");
        db.execSQL("Create Table " + Tabla_Local + " (" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + Local_Nombre + " Text, " + Local_Descripcion + " Text, " +
                Local_TipoLocal + " Text, " + Local_ValoracionPromedio + " Real);");
        db.execSQL("Create Table " + Tabla_Review + " (" + Review_IdLocal + " INTEGER PRIMARY KEY, " + Review_IdUsuario + " INTEGER PRIMARY KEY, " + Review_Comentario + " Text, " +
                Review_Valoracion + " INTEGER);");
        db.execSQL("Create Table " + Tabla_LocalesHijos+ " (" + LocalesHijos_Padre + " INTEGER PRIMARY KEY, " + LocalesHijos_Hijo + " INTEGER PRIMARY KEY);");
        db.execSQL("Create Table " + Tabla_ResultadoBusqueda + " (" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + ResultadoBusqueda_NombreArticulo + " Text);");
        db.execSQL("Create Table " + Tabla_Ubicacion + " (" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + Ubicacion_Direccion + " Text, " + Ubicacion_Latitud + " Real, " +
                Ubicacion_Latitud + " Real, " + Ubicacion_IdLocal + " INTEGER);");
        db.execSQL("Create Table " + Tabla_Articulos + " (" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + Articulos_Nombre + " Text, " + Articulos_Precio + " Real, " +
                Articulos_IdLocal + " INTEGER);");
        db.execSQL("Create Table " + Tabla_LocalesHist + " (" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + LocalesHist_Nombre + " Text);");
        db.execSQL("Create Table " + Tabla_Historial + " (" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + Historial_Direccion + " Text, " + Historial_Fecha+ " Text);");
        db.execSQL("Create Table " + Tabla_HistLocalArticulo + " (" + HistLocalArticulo_IdHistorial + " INTEGER PRIMARY KEY, "+ HistLocalArticulo_IdArticulo + " INTEGER PRIMARY KEY, " +
                HistLocalArticulo_IdLocalHist + " INTEGER PRIMARY KEY);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Tabla_HistLocalArticulo);
        db.execSQL("DROP TABLE IF EXISTS " + Tabla_Historial);
        db.execSQL("DROP TABLE IF EXISTS " + Tabla_LocalesHist);
        db.execSQL("DROP TABLE IF EXISTS " + Tabla_Articulos);
        db.execSQL("DROP TABLE IF EXISTS " + Tabla_ResultadoBusqueda);
        db.execSQL("DROP TABLE IF EXISTS " + Tabla_Ubicacion);
        db.execSQL("DROP TABLE IF EXISTS " + Tabla_Review);
        db.execSQL("DROP TABLE IF EXISTS " + Tabla_LocalesHijos);
        db.execSQL("DROP TABLE IF EXISTS " + Tabla_Local);
        db.execSQL("DROP TABLE IF EXISTS " + Tabla_Usuarios);
        db.execSQL("DROP TABLE IF EXISTS " + Tabla_Preferencias);
        onCreate(db);
    }

    /*public void AgregarMarcador(EntidadMarcadores marcador){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Nombre_Marcador, marcador.getNombre());
        values.put(Latitud, marcador.getLat());
        values.put(Longitud, marcador.getLon());
        db.insertOrThrow(Nombre_Tabla, null, values);
    }

    public List<EntidadMarcadores> ObtenerMarcadores(){
        SQLiteDatabase db = this.getReadableDatabase();
        List<EntidadMarcadores> ret = new ArrayList<EntidadMarcadores>();
        Cursor cursor = db.query(Nombre_Tabla, FROM, null, null, null, null, _ID + " Desc");

        while(cursor.moveToNext()){
            long id = cursor.getLong(0);
            String nombre = cursor.getString(1);
            Double lat = Double.parseDouble(cursor.getString(2));
            Double lon = Double.parseDouble(cursor.getString(3));
            ret.add(new EntidadMarcadores(id, nombre, lat, lon));
        }
        return ret;
    }*/
}
