package twitter.oop;

import twitter.oop.abstrak.Binatang;

public class Anjing extends Binatang { // ekstend di kelas turunan
    @Override
    public void suara() { // method abstrak
        System.out.println("wooooooooffff");
    }

//        public static void main(String[] args) {
//            // Menggunakan ArrayList dengan generics
//            List<String> daftarNama = new ArrayList<>();
//            daftarNama.add("Alice");
//            daftarNama.add("Bob");
//            daftarNama.add("Charlie");
//
//            // Menggunakan HashSet dengan generics
//            Set<Integer> angkaAcak = new HashSet<>();
//            angkaAcak.add(10);
//            angkaAcak.add(20);
//            angkaAcak.add(30);
//
//            // Menggunakan HashMap dengan generics
//            Map<String, Integer> nilaiSiswa = new HashMap<>();
//            nilaiSiswa.put("Alice", 95);
//            nilaiSiswa.put("Bob", 87);
//            nilaiSiswa.put("Charlie", 92);
//
//            // Mengakses elemen-elemen koleksi
//            System.out.println("Daftar Nama: " + daftarNama);
//            System.out.println("Angka Acak: " + angkaAcak);
//            System.out.println("Nilai Siswa: " + nilaiSiswa);
//
//            // Menggunakan generics untuk tipe data khusus
//            String nama = daftarNama.get(0);
//            int nilaiBob = nilaiSiswa.get("Bob");
//
//            System.out.println("Nama pertama: " + nama);
//            System.out.println("Nilai Bob: " + nilaiBob);
//
//    }

}
