package twitter.oop;

public class Kucing extends Hewan implements Bunyi {

    public Kucing(String jenis) {
        super(jenis);
    }

    // Kita dapat menambahkan metode tambahan
    public void tidur() {
        System.out.println("Kucing tidur...");
    }

    // Kita juga dapat mengubah perilaku metode yang diwarisi
    // ini Overriding dari Kelas Hewan
    @Override
    public void bersuara() {
        System.out.println("Kucing mengeluarkan suara: Meong!");
    }

    // ini polimofisme dari interface Bunyi bray !
    @Override
    public void berbunyi() {
        System.out.println("Kucing ini bunyi nya meong bray ! ");
    }
}
