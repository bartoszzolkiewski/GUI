package app;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Student> studList = new ArrayList<>();
        studList.add(new Student("Ala", 1));
        studList.add(new Student("Bartek", 5));
        studList.add(new Student("Kamil", 3));
        studList.add(new Student("Paweł", 2));

        studList.sort(new StudentSortComparator(StudentSortType.BYAGE));

        for(Student s : studList) {
            System.out.println(s);
        }
    }
}