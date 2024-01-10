public class Element<E> {
    private E object;
    private Element<E> next;

    public Element(E newObject) {
        object = newObject; // no hace falta el this.object pk se llaman distintos
        next = null;
    }

    public void setNext(Element nextElement) {
        next = nextElement;
    }

    public Element getNext() {
        return next;
    }

    public E getObject() {
        return object;
    }

    public void setObject(E object) {
        this.object = object;
    }

    public void delete() {
        object = null;
        next = null;
    }
}

