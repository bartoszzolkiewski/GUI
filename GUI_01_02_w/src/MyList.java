public class MyList<T extends Comparable<T>> {
    Element<T> head;

    public void add(T data) {
        Element<T> tmp = new Element<T>();
        tmp.data = data;
        tmp.next = head;
        
        System.out.println(
            // this.head.compareTo(tmp)
            this.head.data.compareTo(tmp.data)
        );
        this.head = tmp;
    }

    public void show() {
        Element<T> tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}