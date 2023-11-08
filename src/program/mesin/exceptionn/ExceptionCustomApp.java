package program.mesin.exceptionn;

public class ExceptionCustomApp {

    // membuat method untuk tes exception handle
    // menambahkan Kelas Custom Exception Handling ke dalam Method
    public static void myTestException() throws ExceptionCustomMe {
        boolean network = true; // kita buat kondisi true
        if (network) {
            // menangani exception jika terjadi error
            throw new ExceptionCustomMe("terjadi kesalahan network");
        }
    }

    public static void main(String[] args) {
        try {
            myTestException();
        } catch (ExceptionCustomMe e) {
            // menangangi exception custom yang dihasilkan dengan
            // melihat pesan yang ditampilkan dari error.
            System.out.println("custom error : " + e.getMessage());
        }
    }
}
