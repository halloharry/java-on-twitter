package twitter.curriculumbasic.model;

public class ContohMobil {
    // Atribut yang kita buat bray
    public String merek;
    public String warna;
    public int tahunProduksi;

    // Konstruktor untuk kelas Karyawan
    public ContohMobil(String merek, String warna, int tahunProduksi) {
        this.merek = merek;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    // Metode disini bakal kita pakai untuk memberikan instruksi
    // apa yang akan dilakukan sama si mobil ini nantinya bray
    public void menghidupkanMesin() {
        System.out.println("Method untuk nyalain mobil");
        System.out.println("Mesin mobil dinyalakan.");
    }

    public void bergerakMaju() {
        System.out.println("Method untuk Mobil bergerak maju.");
        System.out.println("Mobil bergerak maju.");
    }
}

