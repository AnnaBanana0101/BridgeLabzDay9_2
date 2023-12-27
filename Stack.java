public class Stack{
    public static void main(String[] args) throws Exception {
        System.out.println("Stack implementation using LL");
        System.out.println("");

        LinkedList<Integer> stack = new LinkedList<>();

        System.out.println("Pushing elements:");
        stack.pushStack(70);
        stack.pushStack(30);
        stack.pushStack(56);
        System.out.println("");
        stack.display();

        System.out.println("Popping elements:");
        stack.popFirst();
        stack.display();

        System.out.println("");

               
    }
}
