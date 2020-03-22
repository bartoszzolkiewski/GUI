package app;

public class App {
    public static void main(String[] args) throws Exception {
        Spiewak s1 = new Spiewak("Eminem") {
            @Override
            String spiewaj() {
                return "You own it, you better never let it go";
            }
        };
        Spiewak s2 = new Spiewak("Eagles") {
            @Override
            String spiewaj() {
                return "Hotel California";
            }
        };
        Spiewak s3 = new Spiewak("Dzem") {
            @Override
            String spiewaj() {
                return "Chwila, ktora trwa moze byc najlepsza z Twoich chwil...";
            }
        };

        Spiewak[] sp = {s1, s2, s3};

        for (Spiewak s : sp) {
            System.out.println(s);
        }
        
        System.out.println("\n" + Spiewak.najglosniej(sp));
    }
}