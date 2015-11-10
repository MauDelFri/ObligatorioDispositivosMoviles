package Entidades;

import java.util.List;

/**
 * Created by Mauricio on 09/11/2015.
 */
public class LocalHist {
    private int id;
    private String nombre;
    private List<Articulo> articulos;

    public LocalHist() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
}
