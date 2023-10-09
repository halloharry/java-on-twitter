package twitter.oop.koleksi;

import java.util.HashSet;
import java.util.Set;

public class ContohSet {

    private static void setPertama() {
        Set<Integer> beberapaAngka = new HashSet<>();
        beberapaAngka.add(5);
        beberapaAngka.add(2);
        beberapaAngka.add(8);
        // angka 8 ini tidak akan tampil duplikatdi konsol
        beberapaAngka.add(8);

        System.out.println("beberapaAngka = " + beberapaAngka);
    }

    public static void main(String[] args) {
        setPertama();
    }
}
