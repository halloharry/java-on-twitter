package twitter.basicjava.loop;

public class WhileLoop {
    public static void main(String[] args) {
        // inisialisasi variabel angka.
        // Ini dilakukan sebelum perulangan dimulai.
        int angka = 0;

        // i < 5 adalah kondisi yang akan dievaluasi
        // sebelum setiap iterasi.
        // Jika kondisi ini salah, perulangan akan berhenti.
        while (angka < 5) {
            System.out.println("Iterasi ke-" + angka);

            // angka ditambahkan untuk melanjutkan perulangan
            angka++;
        }
    }
}
