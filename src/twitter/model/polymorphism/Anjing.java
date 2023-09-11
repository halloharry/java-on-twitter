package twitter.model.polymorphism;

public class Anjing extends Hewan {

    // Override method bersuara dari kelas hewan
    @Override
    public void bersuara() {
        // membuat method bersuara dengan suara anjing
        System.out.println("Woof!");
    }
}