package twitter.curriculumbasic.basicjava.arraydanlist;

public class ContohArray3 {
    public static void main(String[] args) {

        /**
         * disini kita bikin sekumpulan array
         kita bisa pakai curly braces untuk membuatnya
         */
        int[] angkaArray = {10, 20, 30, 40, 50};

        // for loop kita lakukan dan kita mau nampilin di konsol
        /**
         * cek modul 3 buat lihat materi for loop
         */
        for (int i = 0; i < angkaArray.length; i++) {
            System.out.println("Elemen ke-" + i + ": " + angkaArray[i]);
        }
        System.out.println(" ");

        // kita bikin nama nya ya, bebas aja
        String[] namaPresiden = {"Habibie", "Jokowi", "Anies", "Prabowo", "Luhut"};

        // looping biar di tampilin di konsol
        for (int i = 0; i < angkaArray.length; i++) {
            System.out.println("Presiden di elemen ke-" + i + ": " + namaPresiden[i]);
        }
    }
}
