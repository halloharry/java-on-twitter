package twitter.variable;

public class ContohVariable2 {
    public static void main(String[] args) {
        System.out.println(" ");
        // Variabel untuk menyimpan angka bulat
        int nilaiMatematika;

        // Variabel untuk menyimpan teks (karakter)
        char jenisKelamin;

        // bisa juga menggunakan String bray
        // hanya saja ini akan menambah konsumsi memori
        String jenisKelamin2;

        // Variabel untuk menyimpan bilangan desimal
        double tinggiBadan;

        // Variabel untuk menyimpan nilai kebenaran
        boolean sudahMasuk;

        // Memberikan nilai pada variabel
        nilaiMatematika = 90;
        jenisKelamin = 'L';
        jenisKelamin2 = "Laki-laki";
        tinggiBadan = 170.5;
        sudahMasuk = true;

        // Menampilkan nilai variabel
        System.out.println("Nilai matematika: " + nilaiMatematika);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Jenis kelamin 2: " + jenisKelamin2);
        System.out.println("Tinggi badan: " + tinggiBadan);
        System.out.println("Sudah masuk: " + sudahMasuk);
    }
}

