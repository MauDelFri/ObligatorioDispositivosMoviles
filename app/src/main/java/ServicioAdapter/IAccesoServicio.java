package ServicioAdapter;

import java.util.List;

import Entidades.*;

/**
 * Created by Mauricio on 09/11/2015.
 */
public interface IAccesoServicio {

    List<Articulo> GetArticulos(int id);

    void CrearUsuario(Usuario usuarioNuevo);

    String VerificarUsuario(String nombre, String contraseña);

    Preferencia ObtenerPreferencias(Usuario usuario);

    void ActualizarPreferencias(String nombreUsuario, Preferencia preferencias);

    List<Articulo> BusquedaArticulo(String texto);

    List<Local> RealizarBusqueda(List<Articulo> articulos);

    void GuardarReviews(Review review);

    List<Review> ObtenerReviewsLocal(Local local);

    List<Local> ObtenerLocalesCercanos(String latitud, String longitud);
}
