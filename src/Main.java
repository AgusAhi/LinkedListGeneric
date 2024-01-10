public class Main {
    public static void main(String[] args) throws ObjectNotFoundException, InvalidIndexException {
        LinkedList<String> list = new LinkedList<String>();
        System.out.println("MY LIST :");
        list.insertLast("11111");
        list.insertLast("22222");
        list.insertLast("33333");
        list.insertLast("44444");
        list.insertLast("55555");
        list.print();
        System.out.println("----------");
        System.out.println("Removing a object...");
        list.removeObject("44444");
        list.print();
        System.out.println("----------");
        System.out.println("The first Object:");
        System.out.println(list.getFirstObject());
        System.out.println("----------");
        System.out.println("The last Object:");
        System.out.println(list.getLastObject());
        System.out.println("----------");
        System.out.println("Num of Elements:");
        System.out.println(list.getNumElements());
        System.out.println("----------");
        System.out.println("This possition:");
        System.out.println(list.getObjectAtPosition(1));


    }
}
