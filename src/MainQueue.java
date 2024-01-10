public class MainQueue {
    public static void main(String[] args) throws ObjectNotFoundException {
        try {
            Queue queue = new Queue();

            queue.push("One");
            queue.push("Two");
            queue.push("Three");
            queue.push("Four");
            queue.print();
            System.out.println(queue.pop());
            System.out.println(queue.pop());
            queue.print( );
        } catch (EmptyListException e) {
            System.err.println("The queue was empty");

        }



    }
}
