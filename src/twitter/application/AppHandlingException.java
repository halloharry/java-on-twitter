package twitter.application;

import twitter.util.CustomException;

public class AppHandlingException {
    public static void main(String[] args) {
        try {
            cobacoba();
        } catch (CustomException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

//        try {
        // Kode yang mungkin menghasilkan eksepsi
//            int hasil = 10 / 0;
//            System.out.println("hasil = " + hasil);
//        }
//        catch (ArithmeticException e) {
//             Menangkap eksepsi ArithmeticException
//            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());
//        }
    }

    private static void cobacoba() throws CustomException {
        // Simulasikan suatu kondisi yang memerlukan pelemparan eksepsi
        boolean terjadiKesalahan = true;

        if (terjadiKesalahan) {
            throw new CustomException("Ini adalah pesan kesalahan kustom.");
        }

        System.out.println("Kode lain yang dijalankan jika tidak ada eksepsi.");
    }
}
