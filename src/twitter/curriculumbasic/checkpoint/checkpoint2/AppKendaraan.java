package twitter.curriculumbasic.checkpoint.checkpoint2;

public class AppKendaraan {
    public static void main(String[] args) {

        // Modul 7: Pewarisan dan Polimorfisme dalam Java
        Kendaraan mobil = new Mobil("Toyota", 2022, "Sedan");
        Kendaraan sepedaMotor = new SepedaMotor("Honda", 2021, "Matic");

        // bikin array
        Kendaraan[] kendaraan = {mobil, sepedaMotor};

        for (Kendaraan k : kendaraan) {
            k.tampilkanInfo();
            k.jalankan();
            k.klakson();
            System.out.println(); // Spasi antar kendaraan
        }
    }
}

