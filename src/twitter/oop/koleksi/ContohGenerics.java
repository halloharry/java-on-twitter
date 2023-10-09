package twitter.oop.koleksi;

public class ContohGenerics<T> {
    private T rumah;

    public ContohGenerics(T rumah) {
        this.rumah = rumah;
    }

    public T getRumah() {
        return rumah;
    }

    public void setRumah(T rumah) {
        this.rumah = rumah;
    }

    public static void main(String[] args) {
        ContohGenerics<String> rumahGedong = new ContohGenerics<>("ini rumah gedong");
        System.out.println("rumahGedong.getRumah() = " + rumahGedong.getRumah());

        ContohGenerics<Integer> jumlahRumah = new ContohGenerics<>(2);
        System.out.println("jumlahRumah.getRumah() = " + jumlahRumah.getRumah());
    }
}
