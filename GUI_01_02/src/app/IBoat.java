package app;

public interface IBoat {
    default void move() {
        System.out.println("Wziuuum");
    }
}