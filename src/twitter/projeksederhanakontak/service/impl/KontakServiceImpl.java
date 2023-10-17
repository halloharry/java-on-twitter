package twitter.projeksederhanakontak.service.impl;

import twitter.oop.exceptionn.MyCustomException;
import twitter.projeksederhanakontak.model.Kontak;
import twitter.projeksederhanakontak.service.PengelolaKontak;

import java.util.*;

public class KontakServiceImpl extends Kontak implements PengelolaKontak {

    public static final String GARIS_BATAS = "--------------------------------------";
    private String alamat;

    public KontakServiceImpl() {
    }

    public KontakServiceImpl(String alamat) {
        this.alamat = alamat;
    }

    public KontakServiceImpl(String nama, String nomorTelepon, String email, Boolean family, String alamat) {
        super(nama, nomorTelepon, email, family);
        this.alamat = alamat;
    }

    @Override
    public List<KontakServiceImpl> tambahKontak() {

        Map<String, KontakServiceImpl> tambahKontak = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println(GARIS_BATAS); // membuat garis batas

        System.out.println("masukan nama");
        String nama = scanner.next(); // membuat variable untuk menyimpan data yang di input


        System.out.println("masukan nomor telepon");
        String nomorTelepon = scanner.next(); // membuat variable untuk menyimpan data yang di input

        System.out.println("masukan email");
        String email = scanner.next(); // membuat variable untuk menyimpan data yang di input

        System.out.println("masukan grup kontak keluarga");
        System.out.println("Y/N");
        String family = scanner.next(); // membuat variable untuk menyimpan data yang di input

        System.out.println("masukan alamat");
        String tempatTinggal = scanner.next(); // membuat variable untuk menyimpan data yang di input

        KontakServiceImpl kontak = new KontakServiceImpl(); // membuat instance objek baru
        kontak.setNama(nama); // set value nama
        kontak.setNomorTelepon(nomorTelepon); // set value nomor telepon
        kontak.setEmail(email); // set value email
        kontak.setAlamat(tempatTinggal); // set value alamat
        // set value family dari string menjadi boolean
        kontak.setFamily(family.equalsIgnoreCase("Y"));

        // menyimpan key = kontak.getNama()
        // menyimpan value = objek kontak.
        // method put ini untuk menambahkan key-value ke Map()
        tambahKontak.put(kontak.getNama(), kontak);

        System.out.println("kontak berhasil ditambahkan : " + tambahKontak.get(kontak.getNama()));
        System.out.println(GARIS_BATAS);

        return new ArrayList<>(tambahKontak.values());

    }

    @Override
    public void menampilkanKontak(List<KontakServiceImpl> kontakList) {
        // membuat instance baru untuk menampung data list
        List<KontakServiceImpl> kontakKeluarga = new ArrayList<>();
        // membuat instance baru untuk menampung data list
        List<KontakServiceImpl> kontakBiasa = new ArrayList<>();

        // loop for each, untuk mengiterasi setiap elemen dari Kontak
        for (KontakServiceImpl kontak : kontakList) {
            if (Boolean.TRUE.equals(kontak.getFamily())) {
                // menambahkan data kontak ke dalam list kontakKeluarga
                kontakKeluarga.add(kontak);
            } else {
                // menambahkan data kontak ke dalam list kontakBiasa
                kontakBiasa.add(kontak);
            }
        }

        System.out.println(GARIS_BATAS);
        System.out.println("Menampilkan Kontak Biasa");
        System.out.println("kontakBiasa = " + kontakBiasa);
        System.out.println("------------------------------------");
        System.out.println("Menampilkan Kontak Keluarga");
        System.out.println("kontakKeluarga = " + kontakKeluarga);
        System.out.println(GARIS_BATAS);
    }

    @Override
    public void hapusKontak(List<KontakServiceImpl> kontakList) throws MyCustomException {
        System.out.println(GARIS_BATAS);
        System.out.println("Masukan Nama Kontak yang");
        System.out.println("Ingin Anda Hapus");
        Scanner scanner = new Scanner(System.in);
        String nama = scanner.next();
        boolean suksesHapus = false; // kondisi awal

        // melakukan looping untuk mengecek setiap elemen di dalam list
        for (KontakServiceImpl kontak : kontakList) {
            // melakukan condition operation statement
            // dengan mencari nama pada properti kontak
            if (nama.equalsIgnoreCase(kontak.getNama())) {
                // hapus kontak tersebut dari dalam list
                kontakList.remove(kontak);
                // mengubah variable boolean menjadi true
                suksesHapus = true;
                System.out.println("Kontak Berhasil Dihapus");
                // stop looping agar tidak terjadi error pada list
                break;
            }
        }
        // kondisi tidak ketemu nama di dalam list
        if (!suksesHapus) {
            throw new MyCustomException("Nama Tidak Ditemukan");

        }
        System.out.println(GARIS_BATAS);
    }


    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "\n nama = " + super.getNama() + ", nomorTelepon = "
                + super.getNomorTelepon() + ", email = " + super.getEmail() + ", alamat = " + alamat + ", family = " + super.getFamily();
    }
}
