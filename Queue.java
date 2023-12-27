
public class Queue {

    public static void main(String[] args) throws Exception {

        LinkedList<Integer> queue = new LinkedList<>();

        System.out.println("Pushing elements:");
        queue.pushQueue(70);
        queue.pushQueue(30);
        queue.pushQueue(56);
        System.out.println("");
        queue.display();

        System.out.println("Popping elements:");
        queue.popFirst();
        queue.display();

        
    }
}