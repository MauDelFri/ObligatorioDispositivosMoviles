package Servicio;

import java.util.ArrayList;
import java.util.List;

import Entidades.*;
import ServicioAdapter.IAccesoServicio;

/**
 * Created by Mauricio on 09/11/2015.
 */
public class AccesoServicio implements IAccesoServicio {

    public List<Articulo> GetArticulos(int id){
        return new ArrayList<Articulo>();
    }

    public void CrearUsuario(Usuario usuarioNuevo){

    }

    public String VerificarUsuario(String nombre, String contraseña){
        return "";
    }

    public Preferencia ObtenerPreferencias(Usuario usuario){
        return new Preferencia();
    }

    public void ActualizarPreferencias(String nombreUsuario, Preferencia preferencias){

    }

    public List<Articulo> BusquedaArticulo(String texto){
        return new ArrayList<Articulo>();
    }

    public List<Local> RealizarBusqueda(List<Articulo> articulos){
        return new ArrayList<Local>();
    }

    public void GuardarReviews(Review review){

    }

    public List<Review> ObtenerReviewsLocal(Local local){
        return new ArrayList<Review>();
    }

    public List<Local> ObtenerLocalesCercanos(String latitud, String longitud){
        return new ArrayList<Local>();
    }
}

