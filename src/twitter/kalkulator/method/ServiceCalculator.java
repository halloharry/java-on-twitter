package twitter.kalkulator.method;

import twitter.kalkulator.model.InputAngka;

import java.util.Scanner;

public class ServiceCalculator extends InputAngka {

    public static final String MASUKKAN_ANGKA_PERTAMA = "Masukkan angka pertama: ";
    public static final String MASUKKAN_ANGKA_KEDUA = "Masukkan angka kedua: ";
    public static final String HASIL_PENJUMLAHAN = "Hasil penjumlahan: ";

    public void penjumlahan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(MASUKKAN_ANGKA_PERTAMA);
        setAngkaSatu(scanner.nextDouble());
        System.out.print(MASUKKAN_ANGKA_KEDUA);
        setAngkaDua(scanner.nextDouble());
        double hasilPenjumlahan = getAngkaSatu() + getAngkaDua();
        System.out.println(HASIL_PENJUMLAHAN + hasilPenjumlahan);
    }

    public void pengurangan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(MASUKKAN_ANGKA_PERTAMA);
        setAngkaSatu(scanner.nextDouble());
        System.out.print(MASUKKAN_ANGKA_KEDUA);
        setAngkaDua(scanner.nextDouble());
        double hasilPengurangan = getAngkaSatu() - getAngkaDua();
        System.out.println("Hasil pengurangan: " + hasilPengurangan);
    }

    public void perkalian() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(MASUKKAN_ANGKA_PERTAMA);
        setAngkaSatu(scanner.nextDouble());
        System.out.print(MASUKKAN_ANGKA_KEDUA);
        setAngkaDua(scanner.nextDouble());
        double hasilPerkalian = getAngkaSatu() * getAngkaDua();
        System.out.println("Hasil perkalian: " + hasilPerkalian);
    }

    public void pembagian() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(MASUKKAN_ANGKA_PERTAMA);
        setAngkaSatu(scanner.nextDouble());
        System.out.print(MASUKKAN_ANGKA_KEDUA);
        setAngkaDua(scanner.nextDouble());
        try {
            if (getAngkaDua() == 0) {
                System.out.println("Pembagian oleh nol tidak diizinkan.");

            } else {
                double hasilPembagian = getAngkaSatu() / getAngkaDua();
                System.out.println("Hasil pembagian: " + hasilPembagian);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: terjadi kesalahan perhitungan.");
        }
    }
}
