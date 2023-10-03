package twitter.curriculumbasic.checkpoint.checkpoint2;

// Modul 7: Pewarisan dan Polimorfisme dalam Java
public class Mobil extends Kendaraan {
    private final String jenis;

    public Mobil(String merek, int tahunProduksi, String jenis) {
        super(merek, tahunProduksi);
        this.jenis = jenis;
    }

    @Override
    public void klakson() {
        System.out.println("Tin tin!");
    }
}
