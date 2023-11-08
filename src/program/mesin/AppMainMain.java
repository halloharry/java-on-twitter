package program.mesin;

import program.mesin.exceptionn.ExceptionCustomMe;

import java.util.Scanner;

public class AppMainMain {
    public static void main(String[] args) {
        MesinServiceImpl mesinService = new MesinServiceImpl();

        Scanner scanner = new Scanner(System.in);

        boolean keluar = true;
        while (keluar) {
            System.out.println("pilih menu");
            System.out.println("1. beli makanan");
            System.out.println("2. keluar");
            System.out.println("-----------------");
            int pilihMenu = scanner.nextInt();
            switch (pilihMenu) {
                case 1 -> {
                    System.out.println("tulis jenis makan");
                    System.out.println("biskuit");
                    System.out.println("chips");
                    System.out.println("oreo");
                    System.out.println("tango");
                    System.out.println("cokelat");
                    System.out.println("--------------------------");
                    String item = scanner.next();
                    System.out.println("masukan jumlah uang");
                    int jumlahUang = scanner.nextInt();
                    try {
                        mesinService.beli(item.substring(0, 1).toUpperCase() + item.substring(1), jumlahUang);
                    } catch (ExceptionCustomMe e) {
                        System.out.println("Custom Error ! : " + e.getMessage());

                    }
                }
                case 2 -> keluar = false;
                default -> System.out.println("pilihan menu tidak ada");
            }
        }
    }
}
