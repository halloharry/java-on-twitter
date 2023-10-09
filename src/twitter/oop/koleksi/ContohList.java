package twitter.oop.koleksi;

import java.util.*;

public class ContohList {

    private static void listNama() {
        // Collection List
        List<String> listNama = new ArrayList<>();

        listNama.add("Joko");
        listNama.add("Karyo");
        listNama.add("Sudirman");

        System.out.println("listNama = " + listNama);
    }

    private static void linkedListNama() {
        LinkedList<String> linkedListNama = new LinkedList<>();

        linkedListNama.add("Budi");
        linkedListNama.add("Lele");
        linkedListNama.add("Rusdi");

        System.out.println("linkedListNama = " + linkedListNama);
    }

    public static void main(String[] args) {
        listNama();
        linkedListNama();
    }
}
