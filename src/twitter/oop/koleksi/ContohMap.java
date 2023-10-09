package twitter.oop.koleksi;

import java.util.HashMap;
import java.util.Map;

public class ContohMap {

    private static void mapPertama() {
        // String sebagai Key, Integer sebagai Value
        // Map<K,V>
        Map<String, Integer> daftarUmur = new HashMap<>();
        daftarUmur.put("Joko", 25);
        daftarUmur.put("Karyo", 30);
        daftarUmur.put("Budi", 28);

        System.out.println("umur joko = " + daftarUmur.get("Joko"));
    }

    public static void main(String[] args) {
        mapPertama();
    }
}
