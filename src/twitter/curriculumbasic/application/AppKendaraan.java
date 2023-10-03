package twitter.curriculumbasic.application;

import twitter.curriculumbasic.model.Mobil;

public class AppKendaraan {

    public static void main(String[] args) {
        System.out.println(" ");

        // Membuat objek Mobil
        Mobil mobilSaya = new Mobil("Toyota", 2022, 4);

        // Memanggil metode info() pada objek Mobil
        mobilSaya.info(); // Ini adalah mobil merek Toyota tahun produksi 2022 dengan 4 pintu.

        // Memanggil metode klakson() pada objek Mobil
        mobilSaya.klakson(); // Beep beep!
    }
}
