package twitter.basicjava.controlStatement;

public class Statement4 {
    public static void main(String[] args) {
        int hari = 2;
        String namaHari;

        switch (hari) {
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
                break;
            case 3:
                namaHari = "Selasa";
                break;
            case 4:
                namaHari = "Rabu";
                break;
            case 5:
                namaHari = "Kamis";
                break;
            case 6:
                namaHari = "Jumat";
                break;
            case 7:
                namaHari = "Sabtu";
                break;
            default:
                namaHari = "Hari tidak valid";
        }

        System.out.println("Hari ini adalah " + namaHari);
    }
}

