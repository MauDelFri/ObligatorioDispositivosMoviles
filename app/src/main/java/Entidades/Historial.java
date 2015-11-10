package Entidades;

import java.util.Date;
import java.util.List;

/**
 * Created by Mauricio on 09/11/2015.
 */
public class Historial {
    private int id;
    private Date fecha;
    private String direccion;
    private List<LocalHist> locales;

    public Historial() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<LocalHist> getLocales() {
        return locales;
    }

    public void setLocales(List<LocalHist> locales) {
        this.locales = locales;
    }
}
