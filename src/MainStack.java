public class MainStack {
    public static void main(String[] args) throws ObjectNotFoundException {
        try {
            Stack<String> stack = new Stack<String>();

            stack.push("One");
            stack.push("Two");
            stack.push("Three");
            stack.push("Four");
            stack.print();
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            stack.print( );
            } catch (EmptyListException e) {
            System.err.println("The stack was empty");

        }



    }
}
