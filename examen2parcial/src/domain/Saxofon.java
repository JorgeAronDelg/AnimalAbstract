package domain;

public class Saxofon {
    private String sonido ;

    public Saxofon() {
    }

    public Saxofon(String sonido) {
        this.sonido = sonido;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
