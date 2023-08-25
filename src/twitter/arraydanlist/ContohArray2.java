package twitter.arraydanlist;

import java.util.Arrays;

public class ContohArray2 {

    public static void main(String[] args) {
        int[] angkaArray = new int[5]; // Membuat array dengan 5 elemen

        // Mengisi elemen-elemen array
        /**
         * ini kita kasih nilai nya bray
         */
        angkaArray[0] = 10;
        angkaArray[1] = 20;
        angkaArray[2] = 30;
        angkaArray[3] = 4;
        angkaArray[4] = 50;

        // Mengakses elemen-elemen array
        /**
         * ini kita ambil berdasarkan index nya
         */
        int nilaiPertama = angkaArray[0]; // Mengambil elemen pertama
        int nilaiKedua = angkaArray[1];   // Mengambil elemen kedua
        int nilaiKetiga = angkaArray[2];   // Mengambil elemen kedua
        int nilaiKeempat = angkaArray[3];   // Mengambil elemen kedua
        int nilaiKelima = angkaArray[4];   // Mengambil elemen kedua

        System.out.println("semua array = " + Arrays.toString(angkaArray));
    }
}
