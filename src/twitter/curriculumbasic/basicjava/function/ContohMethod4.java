package twitter.curriculumbasic.basicjava.function;

public class ContohMethod4 {
    // Variabel global
    static int variabelGlobal = 10; // disini kita buat jadi static(global)

    public static void main(String[] args) {
        System.out.println("menjalankan method main ");
        // Variabel lokal di dalam metode main
        int variabelLokal = 5; // di method main nilai nya = 5

        // maka variable lokal ini kalo kita print akan menghasilkan nilai 5
        System.out.println("Variabel lokal di main: " + variabelLokal);

        // berbeda dengan variable global, karna kita sudah declare dengan
        // nilai 10, dia akan menampilkan nilai 10
        System.out.println("Variabel global: " + variabelGlobal);

        // Memanggil metode lain
        metodeLain();
    }

    public static void metodeLain() {
        System.out.println();
        System.out.println("menjalankan method Lain ");
        // Variabel lokal di dalam metodeLain
        int variabelLokal = 20; // di method ini nilai nya = 20

        // maka variable lokal ini kalo kita print akan menghasilkan nilai 20
        System.out.println("Variabel lokal di metodeLain: " + variabelLokal);

        // berbeda dengan variable global, karna kita sudah declare dengan
        // nilai 10, dia akan menampilkan nilai 10
        System.out.println("Variabel global: " + variabelGlobal);
    }
}

