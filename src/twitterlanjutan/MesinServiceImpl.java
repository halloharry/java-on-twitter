package twitterlanjutan;

import twitterlanjutan.exceptionn.ExceptionCustomMe;

import java.util.*;

public class MesinServiceImpl extends Mesin implements MesinService {
    @Override
    public void beli(String item, int uang) throws ExceptionCustomMe {
        List<Integer> uangPecahan = List.of(2000, 5000, 10000, 20000, 50000);

        Map<String, Integer> jenisMakanan = new HashMap<>();
        jenisMakanan.put("Biskuit", 6000);
        jenisMakanan.put("Chips", 8000);
        jenisMakanan.put("Oreo", 10000);
        jenisMakanan.put("Tango", 12000);
        jenisMakanan.put("Cokelat", 15000);

        Map<String, Integer> stokMakanan = new HashMap<>();
        stokMakanan.put("Biskuit", 2);
        stokMakanan.put("Chips", 1);
        stokMakanan.put("Oreo", 0);
        stokMakanan.put("Tango", 2);
        stokMakanan.put("Cokelat", 1);

        if (jenisMakanan.containsKey(item)) {
            int harga = jenisMakanan.get(item);
            boolean uangCocok = false;
            for (int uangDenominasi : uangPecahan) {
                if (uang == uangDenominasi) {
                    uangCocok = true;
                    System.out.println("uang pecahan sesuai");
                    break;
                }
            }
            if (uang >= harga && uangCocok) {
                if (stokMakanan.get(item) <= 0) {
                    System.out.println("stok makanan kosong");
                    return;
                }
                stokMakanan.put(item, stokMakanan.get(item) - 1);
                System.out.println("berhasil membeli makanan jenis : " + item);
                System.out.println("------------------------------------------");

                System.out.println("melakukan kembalian uang");
                int kembalian = uang - harga;
                System.out.println("uang kembalian anda : " + kembalian);

            } else {
                System.out.println("uang yang anda masukan kurang");
            }
        } else {
            throw new ExceptionCustomMe("item tidak ditemukan");
        }
    }
}
