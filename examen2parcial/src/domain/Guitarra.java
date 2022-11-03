package domain;

public class Guitarra {
    private String sonido ;

    public Guitarra() {
    }

    public Guitarra(String sonido) {
        this.sonido = sonido;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
