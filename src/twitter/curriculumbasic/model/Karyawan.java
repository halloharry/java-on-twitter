package twitter.curriculumbasic.model;

public class Karyawan {
    // Atribut kelas Karyawan
    public String nama;
    public int usia;
    public double gaji;

    // Metode untuk menampilkan informasi karyawan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Gaji: Rp. " + gaji);
    }
}

