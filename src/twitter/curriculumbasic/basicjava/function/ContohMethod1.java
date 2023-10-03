package twitter.curriculumbasic.basicjava.function;

public class ContohMethod1 {
    // Method untuk menghasilkan pesan selamat datang disini bray
    public static String generateWelcomeMessage(String nama) {
        String pesan = "selamat datang disini bray, " + nama + "!";
        return pesan; // Mengembalikan pesan selamat datang
    }

    public static void main(String[] args) {
        // kita bikin variable baru dengan tipe data string
        // kita buat namanya joko
        String nama = "Joko";
        String pesan = generateWelcomeMessage(nama); // Memanggil metode dan menyimpan hasilnya
        // kita print hasil nya di console bray !!
        System.out.println(pesan);
    }

}
