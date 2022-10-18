public class Main {
    public static void main(String[] args) {
        Animal p = new Perro("canito","chapi");

        p.setNombre("Choca");
        p.comer();
        p.caminar();
        p.sonido();

        System.out.println("----------------------------------");
        Animal g = new Perro("Darzy","doberman");
        g.setNombre("Mochita");
        g.comer();
        g.caminar();
        g.sonido();

        System.out.println("----------------------------------");
        Perro perro  = new Perro("Dogy", "Pastor Aleman");
        System.out.println(perro.imprimir());

    }
}
