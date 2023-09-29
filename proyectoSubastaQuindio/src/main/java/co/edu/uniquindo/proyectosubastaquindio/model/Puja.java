package co.edu.uniquindo.proyectosubastaquindio.model;

public class Puja {

    private String codigo;
    private int ofertaInicial;
    private String oferta;


    public Puja() {
    }

    public Puja(String codigo, int ofertaInicial, String oferta) {
        this.codigo = codigo;
        this.ofertaInicial = ofertaInicial;
        this.oferta = oferta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getOfertaInicial() {
        return ofertaInicial;
    }

    public void setOfertaInicial(int ofertaInicial) {
        this.ofertaInicial = ofertaInicial;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }
}
