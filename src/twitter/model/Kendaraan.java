package twitter.model;

// Kelas dasar (superclass) Kendaraan
public class Kendaraan {
    public String merek;
    public int tahunProduksi;

    public void info() {
        System.out.println("Ini adalah kendaraan merek " + merek + " tahun produksi " + tahunProduksi);
    }
}
