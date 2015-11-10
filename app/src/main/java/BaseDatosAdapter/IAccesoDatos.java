package BaseDatosAdapter;

import java.util.List;

import Entidades.*;

/**
 * Created by Mauricio on 09/11/2015.
 */
public interface IAccesoDatos {
    void GuardarUsuario(Usuario usuario);

    void ModificarPreferencias(Preferencia preferencia);

    void GuardarResultadoArticulos(List<Articulo> articulos);

    void GuardarReviews(List<Review> reviews);

    void GuardarResultadoLocales(List<Local> locales);

    void AgregarNuevoHistorico(Historial historico);

    List<Historial> ObtenerHistorico();

    List<LocalHist> ObtenerLocalesHistorico(int idHistorial);

    List<Articulo> ObtenerArticulosHistorico(int idHistorial, int idLocal);

    List<Review> ObtenerReviews(int desde, int cantidad);

    List<Articulo> ObtenerResultadoBusqueda(int desde, int cantidad);

    List<Local> ObtenerResultadoLocales(int desde, int cantidad);
}
