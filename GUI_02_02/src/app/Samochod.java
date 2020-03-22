package app;

public class Samochod {
    private String nrRej;
    private String marka;

    public Samochod(String nrRej, String marka) {
        this.nrRej = nrRej;
        this.marka = marka;
    }

    @Override
    public String toString() {
        return (this.marka + " " + this.nrRej).toUpperCase();
    }
}