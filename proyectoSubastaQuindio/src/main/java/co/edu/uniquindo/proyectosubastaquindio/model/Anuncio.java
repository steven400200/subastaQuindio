package co.edu.uniquindo.proyectosubastaquindio.model;

public class Anuncio {


    private String nombre;

    private String codigo;

    private boolean estado;

    public Anuncio() {
    }

    public Anuncio(String nombre, String codigo, boolean estado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
