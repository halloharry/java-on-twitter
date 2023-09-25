package twitter.kalkulator;


import twitter.kalkulator.method.ServiceCalculator;

import java.util.Scanner;

public class AppKalkulator {

    public static void main(String[] args) {
        ServiceCalculator serviceCalculator = new ServiceCalculator();
        Scanner scanner = new Scanner(System.in);

        boolean ulang = true;
        while (ulang) {
            System.out.println("Kalkulator Sederhana");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1 -> serviceCalculator.penjumlahan();
                case 2 -> serviceCalculator.pengurangan();
                case 3 -> serviceCalculator.perkalian();
                case 4 -> serviceCalculator.pembagian();
                case 5 -> {
                    ulang = false;
                    System.out.println("Terima kasih telah menggunakan Kalkulator Sederhana.");
                }
                default -> System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
        scanner.close();
    }
}
