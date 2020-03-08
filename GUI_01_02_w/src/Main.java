import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // MyList<String> list = new MyList<String>();
        // list.add("Ala");
        // list.add("ma");
        // list.add("kota");

        // list.show();

        // MyList<Student> listStud = new MyList<Student>();
        // listStud.add(new Student(100, "Ala"));
        // listStud.add(new Student(10, "Bartek"));

        // listStud.show();

        Student ala = new Student(100, "Ala");
        Student ala2 = new Student(100, "Kopia Ali");
        Student bartek = new Student(101, "Bartek");

        // Student[] tab = {
        //     ala,
        //     bartek,
        //     ala2
        // };

        // Arrays.sort(tab);

        // for (Student s : tab) {
        //     System.out.println(s);
        // }

        MyList<Student> studList = new MyList<Student>();
        studList.add(ala);
        studList.add(ala2);
        studList.add(bartek);

        studList.show();
    }
}

