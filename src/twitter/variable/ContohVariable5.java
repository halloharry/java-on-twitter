package twitter.variable;

public class ContohVariable5 {
    public static void main(String[] args) {
        System.out.println(" ");
        // kita bikin variable nama pake tipe data string
        String nama;

        // kita kasih nilai nama disini ya
        nama = "Joko"; // tipe data String harus pake petik 2 ya ("")

        // kita print disini
        System.out.println("karna Java jalan perbaris maka ini jalan duluan ya");
        System.out.println("nama = " + nama);

        // kita coba kasih nilai nama baru disini ya
        nama = "Sudirman";
        System.out.println("ini deklarasi ke dua ya bray");
        System.out.println("nama = " + nama);

        // keren kan,
        /**
         *  penjelasannya gini
         karna java jalan per baris, maka pertama kali variable
         "nama" kita isi dengan nama "Joko", namun karna ternyata
         program yang kita buat ini masih berjalan dan variable "nama"
         masih di beri nilai baru dengan "Sudirman" maka nilai akhir dari
         variable nama ini adalah "Sudirman" bukan "Joko"
         keren bray !
         */
    }
}
