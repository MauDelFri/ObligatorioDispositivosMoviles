package Entidades;

/**
 * Created by Mauricio on 09/11/2015.
 */
public class Usuario {
    private int id;
    private String nombre;
    private String password;
    private Preferencia preferencia;

    public Usuario() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Preferencia getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(Preferencia preferencia) {
        this.preferencia = preferencia;
    }
}
