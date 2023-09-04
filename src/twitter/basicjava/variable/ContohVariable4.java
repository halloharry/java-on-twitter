package twitter.basicjava.variable;

public class ContohVariable4 {
    public static void main(String[] args) {

        int usia; // Mendeklarasikan variabel usia dengan tipe data int
        usia = 18; // Memberikan nilai pada variabel usia

        String nama; // Mendeklarasikan variabel nama dengan tipe data String
        nama = "Joko"; // Memberikan nilai pada variabel nama


        String pekerjaan; // Mendeklarasikan variabel pekerjaan dengan tipe data String
        pekerjaan = "Barista"; // Memberikan nilai pada variabel pekerjaan

        // Mendeklarasikan variabel gajian dan bonus dengan tipe data int
        int gajian = 10;
        int bonusGajian = 5; // ingat disini harus case sensitive ya supaya mudah dibaca

        // kita sekarang coba print out di terminal ya
        // kita deklarasi semua variable nya jadi satu ya
        // keren pokonya bray
        System.out.println("halo gua " + nama + " gua kerja jadi " + pekerjaan
                + " umur gua " + usia + " kemaren gua gajian bre " + gajian
                + " dapet bonus segini bre " + bonusGajian);
    }
}
