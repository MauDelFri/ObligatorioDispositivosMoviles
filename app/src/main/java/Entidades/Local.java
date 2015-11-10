package Entidades;

import java.util.List;

/**
 * Created by Mauricio on 09/11/2015.
 */
public class Local {
    private int id;
    private String nombre;
    private String descripcion;
    private double valoracionPromedio;
    private String tipoLocal;
    private List<Articulo> articulos;
    private List<Local> hijos;

    public Local() {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValoracionPromedio() {
        return valoracionPromedio;
    }

    public void setValoracionPromedio(double valoracionPromedio) {
        this.valoracionPromedio = valoracionPromedio;
    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(String tipoLocal) {
        this.tipoLocal = tipoLocal;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public List<Local> getHijos() {
        return hijos;
    }

    public void setHijos(List<Local> hijos) {
        this.hijos = hijos;
    }
}


