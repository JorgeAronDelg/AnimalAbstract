package domain;

public class Piano {
    private String sonido  ;

    public Piano() {
    }

    public Piano(String sonido) {
        this.sonido = sonido;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
