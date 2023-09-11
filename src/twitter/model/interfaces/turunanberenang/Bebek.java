package twitter.model.interfaces.turunanberenang;

import twitter.model.interfaces.Berenang;

// Kelas Bebek yang mengimplementasikan interface Berenang
public class Bebek implements Berenang {

    // kita Override method berenang dari interface Berenang bray
    @Override
    public void berenang() {
        System.out.println("Bebek berenang rame rame bray");
    }
}
