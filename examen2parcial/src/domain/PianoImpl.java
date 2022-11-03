package domain;

public class PianoImpl implements  IPiano{
    @Override
    public void tocarInstrumento(Piano piano) {
        System.out.println(piano.getSonido());
        System.out.println("soy piano");
    }
}
