public abstract class AProducto implements IProducto, IMercaderia{

    private String nombre;
    private int stock;

    public AProducto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    @Override
    public boolean ingresar(Producto producto){
        System.out.println("Producto  ingresado");
        return true;
    }

    @Override
    public boolean darDeBaja(Producto producto){
        System.out.println("Producto dado de baja");
        return false;
    }

    @Override
    public void comprar() {
        System.out.println("producto comprado");
    }

    public int verificarExistencia(){
        System.out.println("Existe Producto");
        return 0;
    }

    public String obtenerTipoProducto(){
        System.out.println("Producto :"+ this.nombre);
        return null;
    }
}
