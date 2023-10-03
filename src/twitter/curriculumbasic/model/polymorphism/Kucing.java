package twitter.curriculumbasic.model.polymorphism;

public class Kucing extends Hewan {

    // Override method bersuara dari kelas hewan
    @Override
    public void bersuara() {
        // membuat method bersuara dengan suara kucing
        System.out.println("Meow!");
    }
}
