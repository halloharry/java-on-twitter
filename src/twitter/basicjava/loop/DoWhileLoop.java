package twitter.basicjava.loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        // deklarasi variabel dan beri nilai
        // nilainya ini bisa bebas ya..
        int angka = 0;

        // Kode dalam blok do akan
        // selalu dijalankan setidaknya satu kali.
        do {
            System.out.println("Iterasi ke-" + angka);
            // kemudian angka akan di increment / ditambahkan
            angka++;

            // disini adalah kondisi pengecekan
            // terus, kondisi i < 5 akan dicek,
            // dan kalo benar, perulangan akan terus berlanjut.
        } while (angka < 5);

    }
}
