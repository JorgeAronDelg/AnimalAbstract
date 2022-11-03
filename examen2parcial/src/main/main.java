package main;

import domain.*;

public class main {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra("groon droon");
        GuitarraImpl guitarraImpl = new GuitarraImpl();
        guitarraImpl.tocarInstrumento(guitarra);

        Piano piano= new Piano("tin tin tin");
        PianoImpl pianoImpl = new PianoImpl();
        pianoImpl.tocarInstrumento(piano);

        Saxofon saxofon = new Saxofon("fuuuu fuu ");
        SaxofonImpl saxofonImpl = new SaxofonImpl();
        saxofonImpl.tocarInstrumento(saxofon);
    }
}
