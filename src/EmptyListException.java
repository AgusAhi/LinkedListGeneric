public class EmptyListException extends ObjectNotFoundException {
    public EmptyListException() {
        super();
    }

    public EmptyListException(String message) {
        super(message);
    }
}
