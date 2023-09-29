package co.edu.uniquindo.proyectosubastaquindio.model;

public class Anunciante {
    private int cantAnunciosActivos;
    private float cantTimpoLimitado;

   public Anunciante(){

   }

    // Constructor con parámetros
    public Anunciante(int cantAnunciosActivos, float cantTimpoLimitado) {
        this.cantAnunciosActivos = cantAnunciosActivos;
        this.cantTimpoLimitado = cantTimpoLimitado;
    }

    // Métodos getters y setters para acceder y modificar los atributos
    public int getCantAnunciosActivos() {
        return cantAnunciosActivos;
    }

    public void setCantAnunciosActivos(int cantAnunciosActivos) {
        this.cantAnunciosActivos = cantAnunciosActivos;
    }

    public float getCantTimpoLimitado() {
        return cantTimpoLimitado;
    }

    public void setCantTimpoLimitado(float cantTimpoLimitado) {
        this.cantTimpoLimitado = cantTimpoLimitado;
    }

    // Otros métodos de la clase
    // ...
}

