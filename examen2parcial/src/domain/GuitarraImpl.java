package domain;

public class GuitarraImpl implements IGuitarra {
    @Override
    public void tocarInstrumento(Guitarra guitarra) {
        System.out.println(guitarra.getSonido());
        System.out.println("soy guitarra");
    }
}
