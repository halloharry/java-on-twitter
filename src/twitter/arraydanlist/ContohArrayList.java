package twitter.arraydanlist;

import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan nama-nama buah
        ArrayList<String> daftarBuah = new ArrayList<>();

        // Menambahkan buah ke dalam ArrayList
        daftarBuah.add("Apel");
        daftarBuah.add("Jeruk");
        daftarBuah.add("Mangga");
        daftarBuah.add("Nangka");

        // Menampilkan isi ArrayList
        System.out.println("Daftar Buah: " + daftarBuah);

        // Menghapus buah dari ArrayList
        daftarBuah.remove("Jeruk");

        // Menampilkan isi ArrayList setelah penghapusan
        System.out.println("Daftar Buah setelah menghapus Jeruk: " + daftarBuah);
    }
}

