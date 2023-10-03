package twitter.curriculumbasic.application;

import twitter.curriculumbasic.model.interfaces.Berenang;
import twitter.curriculumbasic.model.interfaces.turunanberenang.Bebek;
import twitter.curriculumbasic.model.interfaces.turunanberenang.Ikan;

public class AppBerenang {
    public static void main(String[] args) {

        Berenang ikan = new Ikan(); // deklarasi class berenang dengan turunan Ikan
        Berenang bebek = new Bebek(); //deklarasi class berenang dengan turunan Bebek

        ikan.berenang(); // Ikan berenang dengan sirip.
        bebek.berenang(); // Bebek berenang rame rame.

    }
}
