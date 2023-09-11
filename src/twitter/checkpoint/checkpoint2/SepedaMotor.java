package twitter.checkpoint.checkpoint2;

// Modul 7: Pewarisan dan Polimorfisme dalam Java
public class SepedaMotor extends Kendaraan {
    private final String jenis;

    public SepedaMotor(String merek, int tahunProduksi, String jenis) {
        super(merek, tahunProduksi);
        this.jenis = jenis;
    }

    @Override
    public void klakson() {
        System.out.println("Ngeeng!");
    }
}