package twitter.basicjava.arraydanlist;

import java.util.ArrayList;

public class ContohArrayDanArrayList {
    public static void main(String[] args) {
        // Menggunakan array untuk menyimpan nilai-nilai ujian
        int[] nilaiUjian = {85, 90, 78, 2, 88};

        // Menampilkan nilai ujian dari array
        System.out.print("Nilai Ujian dari Array: ");
        for (int i = 0; i < nilaiUjian.length; i++) {
            System.out.print(nilaiUjian[i] + " ");
        }
        System.out.println();

        // Menggunakan ArrayList untuk menyimpan daftar buah
        ArrayList<String> daftarBuah = new ArrayList<>();
        daftarBuah.add("Apel");
        daftarBuah.add("Jeruk");
        daftarBuah.add("Mangga");

        // Menampilkan daftar buah dari ArrayList
        System.out.print("Daftar Buah dari ArrayList: ");
        for (String buah : daftarBuah) {
            System.out.print(buah + " ");
        }
    }
}

