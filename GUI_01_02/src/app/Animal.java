package app;

public class Animal implements IAnimalBehaviours {

    @Override
    public void move() {
        System.out.println("Człap człap człap");
    }

    @Override
    public void speak(String s) {
        System.out.println(s);
    }

}