package BaseDatos;

import java.util.ArrayList;
import java.util.List;

import BaseDatosAdapter.IAccesoDatos;
import Entidades.Articulo;
import Entidades.Historial;
import Entidades.Local;
import Entidades.LocalHist;
import Entidades.Preferencia;
import Entidades.Review;
import Entidades.Usuario;

/**
 * Created by Mauricio on 09/11/2015.
 */
public class AccesoDatos implements IAccesoDatos {

    public void GuardarUsuario(Usuario usuario){

    }

    public void ModificarPreferencias(Preferencia preferencia){

    }

    public void GuardarResultadoArticulos(List<Articulo> articulos){

    }

    public void GuardarReviews(List<Review> reviews){

    }

    public void GuardarResultadoLocales(List<Local> locales){

    }

    public void AgregarNuevoHistorico(Historial historico){

    }

    public List<Historial> ObtenerHistorico(){
        return new ArrayList<Historial>();
    }

    public List<LocalHist> ObtenerLocalesHistorico(int idHistorial){
        return new ArrayList<LocalHist>();
    }

    public List<Articulo> ObtenerArticulosHistorico(int idHistorial, int idLocal){
        return new ArrayList<Articulo>();
    }

    public List<Review> ObtenerReviews(int desde, int cantidad){
        return new ArrayList<Review>();
    }

    public List<Articulo> ObtenerResultadoBusqueda(int desde, int cantidad){
        return new ArrayList<Articulo>();
    }

    public List<Local> ObtenerResultadoLocales(int desde, int cantidad){
        return new ArrayList<Local>();
    }
}
