package app;

public class Amphibious implements IBoat, IAuto {
    boolean isOnGround;

    public Amphibious(boolean isOnGround){
        this.isOnGround = isOnGround;
    }

    public void move() {
        if (this.isOnGround) {
            System.out.println("Slow brum");
        } else {
            System.out.println("Slow wzium");
        }
    }
}