package twitter.curriculumbasic.basicjava.function;

public class ContohMethod2 {

    // Metode untuk penjumlahan dua angka
    public static int tambah(int angka1, int angka2) {
        int hasil = angka1 + angka2;
        return hasil; // Mengembalikan hasil penambahan angka bray
    }

    public static void main(String[] args) {
        System.out.println("Kode kita jalankan bray !!");

        int a = 5; // deklarasi dulu angka nya juga beri nilai bray,
        int b = 3; // deklarasi dulu angka nya juga beri nilai bray,

        int hasilPenambahan = tambah(a, b); // Memanggil metode dan menyimpan hasilnya
        // print di console bray !
        System.out.println("Hasil penambahan: " + hasilPenambahan);
    }
}

