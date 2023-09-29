package co.edu.uniquindo.proyectosubastaquindio.model;

public class Comprador extends Persona{


    private int cantMaxPujasAnuncio;


    public Comprador() {
    }

    public Comprador(int cantMaxPujasAnuncio) {
        this.cantMaxPujasAnuncio = cantMaxPujasAnuncio;
    }

    public int getCantMaxPujasAnuncio() {
        return cantMaxPujasAnuncio;
    }

    public void setCantMaxPujasAnuncio(int cantMaxPujasAnuncio) {
        this.cantMaxPujasAnuncio = cantMaxPujasAnuncio;
    }
}
