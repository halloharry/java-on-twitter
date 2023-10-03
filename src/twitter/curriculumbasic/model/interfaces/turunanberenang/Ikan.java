package twitter.curriculumbasic.model.interfaces.turunanberenang;

import twitter.curriculumbasic.model.interfaces.Berenang;

// Kelas Ikan yang mengimplementasikan interface Berenang
public class Ikan implements Berenang {

    // kita Override method berenang dari interface Berenang bray
    @Override
    public void berenang() {
        System.out.println("Ikan berenang dengan sirip.");
    }
}

