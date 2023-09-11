package twitter.application;

import twitter.model.ContohMobil;

public class Application {

    public static void main(String[] args) {

        // Membuat objek pertama dari kelas "Mobil" dan menyimpannya dalam variabel "mobilPertama"
//        Mobil mobilPertama = new Mobil();

        // Membuat objek kedua dari kelas "Mobil" dan menyimpannya dalam variabel "mobilKedua"
//        Mobil mobilKedua = new Mobil();

        // Mengisi atribut objek "mobilPertama" dengan nilai-nilai tertentu
//        mobilPertama.merek = "Toyota";         // Merek mobil: Toyota
//        mobilPertama.warna = "Merah";          // Warna mobil: Merah
//        mobilPertama.tahunProduksi = 2022;     // Tahun produksi: 2022

        // Mengisi atribut objek "mobilKedua" dengan nilai-nilai tertentu
//        mobilKedua.merek = "Honda";            // Merek mobil: Honda
//        mobilKedua.warna = "Biru";             // Warna mobil: Biru
//        mobilKedua.tahunProduksi = 2021;       // Tahun produksi: 2021

        // Membuat objek dari kelas Mobil dengan konstruktor
        ContohMobil contohMobilPertama = new ContohMobil("Toyota", "Merah", 2022);
        ContohMobil contohMobilKedua = new ContohMobil("Honda", "Biru", 2021);

        System.out.println(" ");
        // Memanggil metode "menghidupkanMesin" dari objek "mobilPertama"
        contohMobilPertama.menghidupkanMesin();       // Output: Mesin mobil dinyalakan.

        System.out.println("-------------------------------");
        // Memanggil metode "bergerakMaju" dari objek "mobilKedua"
        contohMobilKedua.bergerakMaju();


        /**
         *  pada bagian ini kita ingin membuat objek baru dari
         class "Mobil",
         */
//        Mobil mobilPertama = new Mobil();
        /**
         * "Mobil" ini adalah nama class yang kita gunakan
         untuk membuat objek baru.
         * "new" adalah kata kunci untu mengalokasikan memori
         dan membuat baru dari kelas "Mobil"
         * "Mobil()" adalah pemanggilan konstruktor dari class "Mobil"
         *    konstruktor adalah metode khusus untuk menginisialisasi objek yang baru dibuat
         */


    }
}

