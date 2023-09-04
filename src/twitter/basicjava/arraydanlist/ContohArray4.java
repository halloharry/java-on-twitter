package twitter.basicjava.arraydanlist;

public class ContohArray4 {
    public static void main(String[] args) {
        // bikin array baru
        int[] nilaiUjian = new int[3];
        int totalNilai = 0; // bikin variable total

        // tambahkan nilai ke variable dan ke setiap index nya
        int nilaibBologi = nilaiUjian[0] = 70;
        System.out.println("nilaibBologi = " + nilaibBologi);
        int nilaiMatematika = nilaiUjian[0] = 85;
        System.out.println("nilaiMatematika = " + nilaiMatematika);
        int nilaiBahasa = nilaiUjian[0] = 90;
        System.out.println("nilaiBahasa = " + nilaiBahasa);

        // element ke dalam array
        nilaiUjian = new int[]{nilaibBologi, nilaiMatematika, nilaiBahasa};

        // menjumlahkan semua nilai ujian
        for (int i = 0; i < nilaiUjian.length; i++) {
            totalNilai += nilaiUjian[i];
            // += ini sama aja kaya totalnilai = totalNilai + nilaiUjian[i]
        }
        // hitung rata ratanya bray
        double rataRata = (double) totalNilai / nilaiUjian.length;
        System.out.println("Nilai rata-rata ujian: " + rataRata);

    }
}
