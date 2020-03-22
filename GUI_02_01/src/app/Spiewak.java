package app;

public abstract class Spiewak {
    private String nazwisko;
    private static int iloscStartujacych = 0;
    private final int numerStartowy;
    
    abstract String spiewaj();

    public Spiewak(String nazwisko) {
        this.nazwisko = nazwisko;
        this.numerStartowy = ++iloscStartujacych;
    }

    public static String najglosniej(Spiewak[] listaSpiewakow) {
        Spiewak najglosniejszy = listaSpiewakow[0];
        int glosnosc = 0;

        for (Spiewak s : listaSpiewakow) {
            if (s.jakGlosno() > glosnosc) {
                najglosniejszy = s;
                glosnosc = s.jakGlosno();
            }
        }

        return najglosniejszy.toString();
    }

    private int jakGlosno() {
        int count = 0;
        for (char c : this.spiewaj().toCharArray()) {
            if (Character.isUpperCase(c))
                count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return "(" + this.numerStartowy + ") " + this.nazwisko + ": " + this.spiewaj();
    }
}