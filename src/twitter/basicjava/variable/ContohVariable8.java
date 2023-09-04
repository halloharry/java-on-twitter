package twitter.basicjava.variable;

public class ContohVariable8 {
    public static void main(String[] args) {
        // kita coba penjumlahan bray
        // tapi disini kita coba pake tipe data string bray
        String angka1 = "1";
        String angka2 = "2";

        String hasilPenjumlahan = angka1 + angka2;

        // coba kita print di terminal
        System.out.println("hasil penjumlahan kita bray = " + hasilPenjumlahan);
        System.out.println("Hasil nya bukan 1+2 = 3 bray");
        System.out.println("karna penjumlahan disini itu bukan tipe data primitif bray");
        System.out.println("jadi si java ini baca nya dia tipe data non primitif");
        System.out.println();
        System.out.println();
        // coba kita tes pake tipe data primitif
        System.out.println("ini contoh kalo pake tipe data primitif / numerik yaa");
        int a = 1;
        int b = 2;
        int hasil = a + b;
        System.out.println("hasil yang menggunakan tipe data primitif = " + hasil);
    }
}
