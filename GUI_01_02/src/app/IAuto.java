package app;

public interface IAuto {
    default void move() {
        System.out.println("Brum brum");
    }
}