package app;

public class Square implements Comparable<Square> {
    private int length;
    private int number;
    static int counter = 0;

    public Square(int length) {
        counter++;
        this.length = length;
        this.number = counter;
    }

    public int getArea() {
        return this.length * this.length;
    }

    @Override
    public String toString() {
        return this.number + ". " + this.getArea();
    }

    @Override
    public int compareTo(Square o) {
        return Integer.compare(this.length, o.length);
    }

}