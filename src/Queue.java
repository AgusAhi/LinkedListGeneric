// Insertas por arriba y sacas por debajo
public class Queue {
    private LinkedList list;

    public Queue() {
        list = new LinkedList();
    }

    public void push(Object object) {
        list.insertLast(object);
    }

    public Object pop() throws EmptyListException, ObjectNotFoundException {
        Object obj = list.getFirstObject();
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
        list = new LinkedList();
    }

}
