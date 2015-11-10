package Entidades;

/**
 * Created by Mauricio on 09/11/2015.
 */
public class Preferencia {
    private int id;
    private int cantidadLocales;
    private String modoBusqueda;
    private String tipoLocal;

    public Preferencia() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadLocales() {
        return cantidadLocales;
    }

    public void setCantidadLocales(int cantidadLocales) {
        this.cantidadLocales = cantidadLocales;
    }

    public String getModoBusqueda() {
        return modoBusqueda;
    }

    public void setModoBusqueda(String modoBusqueda) {
        this.modoBusqueda = modoBusqueda;
    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(String tipoLocal) {
        this.tipoLocal = tipoLocal;
    }
}
