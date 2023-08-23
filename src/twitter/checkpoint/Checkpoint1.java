package twitter.checkpoint;

public class Checkpoint1 {
    // Variabel global
    static int variabelGlobal = 10;

    public static void main(String[] args) {
        // Modul 1: Menulis dan menjalankan program "Hello, World!"
        // program pertama kita nih bray bikin HELLO WORLD
        System.out.println("Hello, World!");
        System.out.println(" ");

        // Modul 2: Variabel dan Jenis Data dalam Java
        //  kita bikin variable disini bray
        int angka1 = 5;
        double angka2 = 3.5;
        char karakter = 'A';
        String string = "joko";
        boolean benar = true;
        System.out.println("angka1 : " + angka1);
        System.out.println("angka2 : " + angka2);
        System.out.println("karakter : " + karakter);
        System.out.println("string : " + string);
        System.out.println("boolean : " + benar);
        System.out.println(" ");

        // Operasi menggunakan operator atau kita melakukan perhitungan
        int hasilOperasi = angka1 + (int) angka2; // Penjumlahan dengan casting
        System.out.println("Hasil operasi: " + hasilOperasi);
        System.out.println(" ");

        // Modul 3: Aliran Kontrol dan Pengambilan Keputusan
        // kita melakukan pengecekan kondisi bray
        if (hasilOperasi > 5) {
            System.out.println("Hasil operasi lebih dari 5.");
        } else if (hasilOperasi == 5) {
            System.out.println("Hasil operasi sama dengan 5.");
        } else {
            System.out.println("Hasil operasi kurang dari 5.");
        }

        // Modul 4: Fungsi dan Metode dalam Java
        // bikin method bray
        int hasilMetode = hitungKuadrat(4); // Memanggil metode
        System.out.println("Hasil metode: " + hasilMetode);

        // Mengakses variabel global
        System.out.println("Variabel global: " + variabelGlobal);
    }

    // Metode untuk menghitung kuadrat
    public static int hitungKuadrat(int angka) {
        return angka * angka;
    }
}
