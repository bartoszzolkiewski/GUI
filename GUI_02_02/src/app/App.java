package app;

import java.util.*;
import java.util.Map.Entry;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Zad. 1, 2");
        Kontener<String, Integer> kString = new Kontener<>("Asdf", 4321);
        Kontener<Integer, String> kInteger = new Kontener<>(1234, "fdsA");

        kString.wypisz();
        kInteger.wypisz();

        System.out.println("Zad. 3");
        ArrayList<String> aStringList = new ArrayList<>();
        aStringList.add("Ala");
        aStringList.add("ma");
        aStringList.add("Kota");
        System.out.println(aStringList.size());
        for(String s : aStringList)
            System.out.println(s);

        System.out.println("Zad. 4");
        HashSet<Integer> aHashSet = new HashSet<>();
        aHashSet.add(31);
        aHashSet.add(28);
        aHashSet.add(31);
        aHashSet.add(30);
        aHashSet.add(31);
        aHashSet.add(30);
        for(Integer i : aHashSet)
            System.out.println(i);

        System.out.println("Zad. 5");
        HashMap<String, Integer> aHashMap = new HashMap<>();
        aHashMap.put("Styczen", 31);
        aHashMap.put("Luty", 29);
        aHashMap.put("Marzec", 31);
        aHashMap.put("Kwiecien", 30);
        aHashMap.put("Maj", 31);
        System.out.println(aHashMap.get("Marzec"));
        for(String s : aHashMap.keySet())
            System.out.println(s + " " + aHashMap.get(s));
        
        System.out.println("Zad. 6");
        Osoba kowalski = new Osoba("Jan", "Kowalski");     
        Osoba nowak = new Osoba("Adam", "Nowak");      
        Osoba krawczyk = new Osoba("Bartosz", "Krawczyk");            
        Osoba heniek = new Osoba("Kierownik", "Heniek");         
        Samochod skoda1 = new Samochod("WA00001", "Skoda");   
        Samochod skoda2 = new Samochod("SC36010", "Skoda");      
        Samochod mazda1 = new Samochod("WA01234", "Mazda");      
        Samochod mazda2 = new Samochod("DW01ASD", "Mazda");     
        Samochod bmw = new Samochod("WA12690", "BMW");        
        Samochod volvo = new Samochod("KR60606", "Volvo");       
     
        HashMap<Osoba, List<Samochod>> mapaSamochodow = new HashMap<>();
        mapaSamochodow.put(kowalski, new ArrayList<Samochod>());
        mapaSamochodow.put(nowak, new ArrayList<Samochod>());
        mapaSamochodow.put(krawczyk, new ArrayList<Samochod>());
        mapaSamochodow.put(heniek, new ArrayList<Samochod>());
    
        mapaSamochodow.get(kowalski).add(skoda1);
        mapaSamochodow.get(kowalski).add(bmw);
        
        mapaSamochodow.get(nowak).add(mazda2);
        
        mapaSamochodow.get(krawczyk).add(volvo);
        mapaSamochodow.get(krawczyk).add(mazda1);
        mapaSamochodow.get(krawczyk).add(skoda2);

        for (Entry<Osoba, List<Samochod>> e : mapaSamochodow.entrySet()) {
            System.out.println(e.getKey() + " posiada " + e.getValue().size() + " pojazdy");
        }         
        System.out.println(mapaSamochodow.get(nowak).get(0)); // MAZDA DW01ASD  
    }
}
