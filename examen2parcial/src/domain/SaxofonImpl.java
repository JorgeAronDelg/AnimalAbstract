package domain;

public class SaxofonImpl implements  ISaxofon {
    @Override
    public void tocarInstrumento(Saxofon saxofon) {
        System.out.println(saxofon.getSonido());
        System.out.println("Soy Saxofon");
    }
}
