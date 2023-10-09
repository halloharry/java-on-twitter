package twitter.projeksederhanakaryawan.app;

import twitter.projeksederhanakaryawan.model.Karyawan;

import java.util.*;

public class AppAbsen {

    public static void main(String[] args) {
        // Database karyawan
        Map<String, Karyawan> databaseKaryawan = new HashMap<>();

        // Menambahkan beberapa karyawan sebagai contoh
        Karyawan karyawan1 = new Karyawan("jo_ko", "12345", "Jokowi", "Manager", 5000);
        Karyawan karyawan2 = new Karyawan("bu_di", "54321", "Budi Sudarsono", "Pegawai", 3000);

        databaseKaryawan.put(karyawan1.getUsername(), karyawan1);
        databaseKaryawan.put(karyawan2.getUsername(), karyawan2);

        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di Aplikasi Manajemen Absensi Karyawan!");

        boolean keluar = false;
        while (!keluar) {
            System.out.println("\nMenu:");
            System.out.println("1. Absen Karyawan");
            System.out.println("2. Lihat Data Karyawan");
            System.out.println("3. Keluar");

            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan username: ");
                    String username = input.nextLine();
                    System.out.print("Masukkan password: ");
                    String password = input.nextLine();
                    if (databaseKaryawan.containsKey(username)) {
                        Karyawan karyawan = databaseKaryawan.get(username);
                        if (karyawan.getPassword().equals(password)) {
                            karyawan.absen();
                        } else {
                            System.out.println("Password salah.");
                        }
                    } else {
                        System.out.println("Username tidak ditemukan.");
                    }
                }
                case 2 -> {
                    System.out.println("\nDaftar Karyawan:");
                    for (Karyawan karyawan : databaseKaryawan.values()) {
                        karyawan.tampilkanInfo();
                    }
                }
                case 3 -> {
                    keluar = true;
                    System.out.println("Terima kasih!");
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }
}
