package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zad. 1");
        List<Square> squareList = new ArrayList<Square>();
        squareList.add(new Square(20));
        squareList.add(new Square(15));
        squareList.add(new Square(5));
        squareList.add(new Square(25));
        squareList.add(new Square(10));

        for (Square s : squareList) {
            System.out.println(s);
        }
        System.out.println("====================");
        squareList.sort(null);
        
        for (Square s: squareList) {
            System.out.println(s);
        }

        System.out.println("Zad. 2");
        Animal animal = new Animal();
        animal.speak("MUUUU");
        animal.move();

        System.out.println("Zad. 3");
        Auto auto = new Auto();
        Boat boat = new Boat();
        Amphibious waterPhibious = new Amphibious(false);
        Amphibious groundPhibious = new Amphibious(true);

        auto.move();
        boat.move();
        waterPhibious.move();
        groundPhibious.move();
    }
}