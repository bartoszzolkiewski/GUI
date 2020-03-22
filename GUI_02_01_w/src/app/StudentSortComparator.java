package app;

import java.util.Comparator;

public class StudentSortComparator implements Comparator<Student> {
    private StudentSortType sortType;

    public StudentSortComparator(StudentSortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Student o1, Student o2) {
        switch (this.sortType) {
            case BYAGE:
                return o1.age - o2.age;
            case BYNAME:
                return o1.name.compareTo(o2.name);
            default:
                return 0;
        }
    }

}