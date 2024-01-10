// Insertas por arriba y sacas por debajo
public class Queue<E> {
    private LinkedList<E> list;

    public Queue() {
        list = new LinkedList<E>();
    }

    public void push(E object) {
        list.insertLast(object);
    }

    public E pop() throws EmptyListException, ObjectNotFoundException {
        E obj = list.getFirstObject();
        list.removeObject(obj);
        return obj;
    }

    public void print() {
        list.print();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void empty() {
        list = new LinkedList<E>();
    }

}
