package twitter.curriculumbasic.application;

import twitter.curriculumbasic.model.polymorphism.*;

public class AppHewan {
    public static void main(String[] args) {
        Hewan kucing = new Kucing(); // mendeklarasikan kelas Kucing
        Hewan anjing = new Anjing(); // mendeklarasikan kelas Anjing

        System.out.println("suara dari kucing");
        kucing.bersuara(); // Meow!
        System.out.println("---------------");
        System.out.println("suara dari anjing");
        anjing.bersuara(); // Woof!
    }
}
