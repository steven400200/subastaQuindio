package co.edu.uniquindo.proyectosubastaquindio.model;

import co.edu.uniuindio.crudproducto.model.enums.tipoArticulo;

import java.time.LocalDate;

public class Producto {
    private String nombreProducto;
    private String descripcion;

    private String nombreAnunciante;

    private LocalDate fechaPublicacion;

    private LocalDate fechaFinalizacion;

    private float valorInicial;

    private tipoArticulo tipo_Articulo;

    private String urlFoto;


    public  Producto(){

    }

    public Producto(String nombreProducto, String descripcion, String nombreAnunciante, LocalDate fechaPublicacion, LocalDate fechaFinalizacion, float valorInicial, tipoArticulo tipo_Articulo, String urlFoto) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.nombreAnunciante = nombreAnunciante;
        this.fechaPublicacion = fechaPublicacion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.valorInicial = valorInicial;
        this.tipo_Articulo = tipo_Articulo;
        this.urlFoto=urlFoto;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombre) {
        this.nombreProducto = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreAnunciante() {
        return nombreAnunciante;
    }

    public void setNombreAnunciante(String nombreAnunciante) {
        this.nombreAnunciante = nombreAnunciante;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public float getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(float valorInicial) {
        this.valorInicial = valorInicial;
    }

    public tipoArticulo getTipo_Articulo() {
        return tipo_Articulo;
    }

    public void setTipo_Articulo(tipoArticulo tipo_Articulo) {
        this.tipo_Articulo = tipo_Articulo;
    }
}
