public class Element<T extends Comparable<T>> implements Comparable<T>{

    T data;
    Element<T> next;

    @Override
    public int compareTo(T o) {
        return this.data.compareTo(o);
    }
}