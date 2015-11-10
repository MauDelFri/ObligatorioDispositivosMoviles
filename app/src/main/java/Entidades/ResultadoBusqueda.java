package Entidades;

/**
 * Created by Mauricio on 09/11/2015.
 */
public class ResultadoBusqueda {
    private int id;
    private String nombreArticulo;

    public ResultadoBusqueda() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombre) {
        this.nombreArticulo = nombre;
    }
}
