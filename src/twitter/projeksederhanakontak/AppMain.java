package twitter.projeksederhanakontak;

import twitter.oop.exceptionn.MyCustomException;
import twitter.projeksederhanakontak.service.impl.KontakServiceImpl;

import java.util.*;

public class AppMain {

    public static void main(String[] args) {
        // membuat instance baru
        KontakServiceImpl kontak = new KontakServiceImpl();
        // membuat scanner input di konsol
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang ");
        System.out.println("Aplikasi Management Kontak Sederhana ");

        List<KontakServiceImpl> kontakList; // instance baru untuk menampilkan list
        // instance untuk menyimpan data kontak ke dalam list
        List<KontakServiceImpl> simpanKontakList = new ArrayList<>();
        boolean keluar = true; // variable untuk keluar dari loop

        while (keluar) { // looping dengan kondisi true
            System.out.println("1. tambah kontak ");
            System.out.println("2. menampilkan semua kontak ");
            System.out.println("3. Hapus Kontak ");
            System.out.println("4. keluar ");
            int pilihMenu = input.nextInt(); // masukan value untuk menu

            switch (pilihMenu) { // switch case operation
                case 1 -> {
                    // method tambah kontak
                    // mengembalikan nilai dengan properti "kontakList"
                    kontakList = kontak.tambahKontak();
                    // menyimpan list dari "kontakList" ke
                    // properti "simpanKontak"
                    // addAll adalah untuk menyimpan List
                    simpanKontakList.addAll(kontakList);
                }
                case 2 ->
                    // mendeklarasikan method untuk menampilkan list kontak
                        kontak.menampilkanKontak(simpanKontakList);
                case 3 -> {
                    // blok try untuk mencoba kode
                    try {
                        // mendeklarasikan method hapus kontak
                        // memberi value simpanKontakList sebagai parameter list
                        kontak.hapusKontak(simpanKontakList);
                    } catch (MyCustomException e) { // blok catch untuk melempar custom exception

                        System.out.println("Custom Error ! : " + e.getMessage());
                    }
                }
                // keluar dari loop
                case 4 -> keluar = false;
                default -> System.out.println("menu yang kamu pilih tidak ada");
            }
        }
    }
}



