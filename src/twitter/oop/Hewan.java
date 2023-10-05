package twitter.oop;

public class Hewan {
    private String jenis;

    // konstruktor dari objek Hewan
    public Hewan(String jenis) {
        this.jenis = jenis;
    }

    public void bersuara() {
        System.out.println("Hewan ini bersuara...");
    }

    // membuat getter setter
    public String getJenis() {
        return jenis; // method getter
    }

    public void setJenis(String jenis) {
        this.jenis = jenis; // method setter
    }
}


