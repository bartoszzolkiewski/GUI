package app;

public class Kontener<T, S> {
    private T t;
    private S s;

    public Kontener(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public void wypisz() {
        System.out.println(this.t + " " + this.s);
    }
}

