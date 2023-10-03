package twitter.curriculumbasic.basicjava.function;

public class ContohMethod {

    public static void buatKopi() {
        // Kode untuk membuat secangkir kopi
        System.out.println("Langkah 1: Panasin air.");
        System.out.println("Langkah 2: Campur kopi.");
        System.out.println("Langkah 3: Tuang air panas ke dalam cangkir.");
        System.out.println("Langkah 4: Nikmatin kopi kita bray!");
    }

    // method buatKopi() kita panggil disini bray !
    public static void main(String[] args) {
        // kita bikin log disini supaya kita tau
        System.out.println("Mulai membuat kopi.");

        buatKopi(); // Memanggil metode untuk membuat kopi

        System.out.println("Selesai membuat kopi.");
    }
}
