package twitter.application;

import twitter.model.Karyawan;

public class KaryawanApp {

    public static void main(String[] args) {
        // Membuat objek karyawan menggunakan konstruktor
        Karyawan karyawan1 = new Karyawan();
        Karyawan karyawan2 = new Karyawan();

        // Mengisi atribut objek "karyawan1" dengan nilai-nilai tertentu
        karyawan1.nama = "joko";
        karyawan1.usia = 32;
        karyawan1.gaji = 10000000;

        // Mengisi atribut objek "karyawan2" dengan nilai-nilai tertentu
        karyawan2.nama = "karyo";
        karyawan2.usia = 55;
        karyawan2.gaji = 20000000;

        // Menampilkan informasi karyawan
        System.out.println("Informasi Karyawan 1:");
        karyawan1.tampilkanInfo();

        System.out.println("\nInformasi Karyawan 2:");
        karyawan2.tampilkanInfo();
    }
}
