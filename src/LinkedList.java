public class LinkedList<E> {
    private Element<E> first;
    private Element<E> last;

    public LinkedList() {
        first = null;
        last = null;
    }

    public void insertFirst(E object) {
        Element<E> element = new Element<E>(object);
        element.setNext(first);
        first = element;
        if (isEmpty()) {
            last = element;
        }
    }

    public void print () {
        Element<E> e = first;
        while (e != null) {
            System.out.println(e.getObject());
            e = e.getNext();
        }
    }

    public void insertLast(E object) {
        Element<E> element = new Element<E>(object);
        if (isEmpty()) {
            first = element;
        } else {
            last.setNext(element);
        }
        last = element;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void removeObject(E object) throws
            ObjectNotFoundException, EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("the list is empty");
        }
        Element<E> e = first;
        Element<E> prevElement = first;

        while (e != null && !e.getObject().equals(object)) {
            prevElement = e;
            e = e.getNext();
        }

        if (e == null) {
            throw new ObjectNotFoundException(object + "not found");
        }
        // I have to delete

        // Si la lista solo tiene un elemento pondremos los 2 a null
        if (first == last) {
            first = null;
            last = null;
            return;
        }

        // bypass
        prevElement.setNext(e.getNext());

        // It was the first node
        if (first == e) {
            first = e.getNext();
        }

        // It was the last node
        if (last == e) {
            last = prevElement;
        }
    }

    public E getFirstObject() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("the list is empty");
        }

        Element<E> e = first;
        return e.getObject();
    }

    public E getLastObject() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("the list is empty");
        }

        Element<E> e = last;
        return e.getObject();
    }

    public int getNumElements() {
        Element<E> e = first;
        int counter = 0;
        while (e != null) {
            counter++;
            e = e.getNext();
        }
        return counter;
    }

    public E getObjectAtPosition(int i)
            throws EmptyListException, InvalidIndexException {
        if (i < 0) {
            throw new InvalidIndexException(i + " not a valid index");
        }
        Element<E> e = first;
        int counter = 0;

        while (e != null) {
            if (i == counter) {
                return e.getObject();
            }
            e = e.getNext();
            counter++;
        }
        throw new InvalidIndexException(i +
                " not a valid index. Max index = " + (counter - 1));

    }





}
