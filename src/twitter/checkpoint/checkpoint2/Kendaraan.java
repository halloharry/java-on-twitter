package twitter.checkpoint.checkpoint2;

// Modul 1: Pengenalan Pemrograman Java
public class Kendaraan {

    private final String merek;
    private final int tahunProduksi;

    // Modul 6: Dasar-Dasar Pemrograman Berorientasi Objek (OOP)
    public Kendaraan(String merek, int tahunProduksi) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
    }

    // Modul 2: Variabel dan Jenis Data dalam Java
    public void tampilkanInfo() {
        System.out.println("Kendaraan " + merek + ", Tahun Produksi: " + tahunProduksi);
    }

    // Modul 3: Aliran Kontrol dan Pengambilan Keputusan
    public void jalankan() {
        if (tahunProduksi >= 2020) {
            System.out.println("Kendaraan baru. Siap untuk digunakan.");
        } else {
            System.out.println("Kendaraan lama. Perlu perawatan lebih lanjut.");
        }
    }

    // Modul 4: Fungsi dan Metode dalam Java
    public void klakson() {
        System.out.println("Telolet!");
    }
}
