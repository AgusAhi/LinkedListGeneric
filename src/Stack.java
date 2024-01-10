// Insertas por arriba y sacas por arriba
public class Stack<E> {
    private LinkedList<E> list;

    public Stack() {
        list = new LinkedList<E>();
    }

    public void push(E object) {
        list.insertFirst(object);
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
