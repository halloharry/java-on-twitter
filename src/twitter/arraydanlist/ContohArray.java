package twitter.arraydanlist;

public class ContohArray {
    public static void main(String[] args) {
        int[] nilaiSiswa = new int[5];

        // Mengisi elemen-elemen array
        nilaiSiswa[0] = 90; // disini kita dapat mengisi nilai di variable
        nilaiSiswa[1] = 85;
        nilaiSiswa[2] = 78;
        nilaiSiswa[3] = 95;
        nilaiSiswa[4] = 8;

        nilaiSiswa[5] = 1;

        // Mengakses elemen-elemen array
        int nilaiPertama = nilaiSiswa[0];
        int nilaiKedua = nilaiSiswa[1];
//        int nilai3 = nilaiSiswa[5];

        // menampilkan di konsol
        System.out.println("array yang kita buat bray ! ");
        System.out.println("nilaiPertama = " + nilaiPertama);
        System.out.println("nilaiPertama = " + nilaiKedua);
//        System.out.println("index ke 5 = " + nilai3);
    }
}

/**
 * kenapa kok error kalau kita coba ambil index ke 6?
 * karna elemen yang kita buat hanya 5
 * maka dari itu kita mencoba untuk mendapatkan index ke 5
 * java mencari nya dan ternyata tidak ada
 * akhirnya mendpatkan error seperti ini
 * java.lang.ArrayIndexOutOfBoundsException
 */
