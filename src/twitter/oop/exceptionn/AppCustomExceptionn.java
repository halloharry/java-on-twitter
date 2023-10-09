package twitter.oop.exceptionn;

public class AppCustomExceptionn {

    // membuat method untuk tes exception handle
    // menambahkan Kelas Custom Exception Handling ke dalam Method
    public static void tesException() throws MyCustomException {
        boolean network = true; // kita buat kondisi true
        if (network) {
            // menangani exception jika terjadi error
            throw new MyCustomException("terjadi kesalahan network");
        }
    }

    public static void main(String[] args) {
        try {
            tesException();
        } catch (MyCustomException e) {
            // menangangi exception custom yang dihasilkan dengan
            // melihat pesan yang ditampilkan dari error.
            System.out.println("custom error : " + e.getMessage());
        }
    }
}
