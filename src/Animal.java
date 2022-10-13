public abstract class Animal {
    protected String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println("esta comiendo");
    }

    public void caminar(){
        System.out.println("esta caminando");
    }

    public abstract void sonido();

    public String imprimir(){
        return "Nombre: " + this.nombre;
    }
}
