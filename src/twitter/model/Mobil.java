package twitter.model;

// Subkelas Mobil yang mewarisi Kendaraan
public class Mobil extends Kendaraan {
    public int jumlahPintu;

    // Konstruktor untuk Mobil
    public Mobil(String merek, int tahunProduksi, int pintu) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.jumlahPintu = pintu;
    }

    // Metode khusus untuk Mobil
    public void klakson() {
        System.out.println("Beep beep!");
    }

    // Override metode info() dari superclass Kendaraan
    @Override
    public void info() {
        System.out.println("Ini adalah mobil merek " + merek + " tahun produksi " + tahunProduksi + " dengan " + jumlahPintu + " pintu.");
    }

    /**
     * Anotasi @Override adalah salah satu anotasi yang digunakan dalam pemrograman Java untuk memberi
     * tahu kompiler bahwa metode yang didefinisikan dalam kelas saat ini adalah penggantian dari metode
     * yang sudah ada dalam superclassnya. Dengan kata lain, Anda menggunakan
     * @Override untuk mengindikasikan bahwa Anda bermaksud meng-override
     * (mengganti) metode dari superclass dalam subclass.
     */
}
