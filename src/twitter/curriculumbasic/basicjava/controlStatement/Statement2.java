package twitter.curriculumbasic.basicjava.controlStatement;

public class Statement2 {
    public static void main(String[] args) {

        int angka = 15; // inisialisasi variable yang kita buat bre

        // disini kita lakukan pengecekan bre
        if (angka > 20) { // kita kasih kondisi apakah angka lebih besar dari 20 ?
            // jika benar maka masuk ke dalam blok
            // dan jalankan kode dibawah ini
            System.out.println("Angka lebih besar dari 20.");

        } else if (angka < 15) { // kita kasih kondisi apakah angka kurang dari 15 ?
            // jika benar maka masuk ke dalam blok
            // dan jalankan kode dibawah ini
            System.out.println("Angka kurang dari 15.");

        } else { // jika kedua kondisi diatas tidak terpenuhi maka
            // kode ini akan dijalankan
            System.out.println("Angka sama dengan 15.");
        }
    }
}
