package domain;

public class Pokemon {

    private int numPokedex;
    private String nombre;
    private double peso;
    private char sexo;
    private int temporada;
    private String tipo;
    private String ataque;

    public Pokemon() {
    }

    public Pokemon(int numPokedex, String nombre, double peso, char sexo, int temporada, String tipo, String ataque) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.temporada = temporada;
        this.tipo = tipo;
        this.ataque = ataque;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "numPokedex=" + numPokedex +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", sexo=" + sexo +
                ", temporada=" + temporada +
                ", tipo='" + tipo + '\'' +
                ", ataque='" + ataque + '\'' +
                '}';
    }
}
