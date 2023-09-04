package twitter.basicjava.function;

public class ContohMethod3 {

    public static int hitungTotalHarga(String topping, int jumlahKopi) {
        int hargaKopi = 10; // Harga per kopi
        int totalHarga = hargaKopi * jumlahKopi;

        if (topping.equals("es krim")) {
            totalHarga += 5; // Tambahkan biaya tambahan untuk es krim
        } else if (topping.equals("extra shoot")) {
            totalHarga += 4; // Tambahkan biaya tambahan untuk extra shoot
        }

        return totalHarga; // Mengembalikan total harga pesanan kopi
    }

    /**
     * kita panggil metode hitungTotalHarga(topping, jumlahKopi)
     * dengan memberikan jenis topping dan jumlah kopi sebagai argumen.
     * Hasilnya disimpan dalam variabel totalHarga.
     * <p>
     * Terakhir, kita print mencetak total harga
     * pesanan kopi dengan menambahkan "Rp." dan totalHarga ke pesan di consol.
     * <p>
     * adi, kode ini melakukan perhitungan total harga pesanan
     * kopi berdasarkan jenis topping dan jumlahnya,
     * dan kemudian mencetak hasilnya ke layar.
     * di contoh ini bray, total harga adalah Rp. 35 karena kita
     * pesen 3 kopi dengan tambahan "es krim."
     */


    public static void main(String[] args) {
        System.out.println("Kode kita jalanin bray !!!");

        String topping = "es krim"; // kita hardcode untuk topping
        int jumlahKopi = 3;

        double totalHarga = hitungTotalHarga(topping, jumlahKopi); // Memanggil metode dan menyimpan hasilnya
        System.out.println("Total harga pesanan Kopi kita: Rp. " + totalHarga);
    }
}
