public class Student implements Comparable<Student> {
    int id;
    String imie;

    public Student(final int id, final String imie) {
        this.id = id;
        this.imie = imie;
    }

    public String toString() {
        return this.id + " " + this.imie;
    }

    @Override
    public int compareTo(final Student o) {
        if (this.id > o.id) 
            return 1;
        else if (this.id < o.id)
            return -1;
        else
            return this.imie.compareTo(o.imie);
    }
}