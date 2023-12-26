
public class LinkedList<T> {

    Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void pushStack(T data) {
        Node<T> newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node<T> temp = head;

        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void pushQueue(T data) {

        Node<T> newNode = new Node<>(data);

        if (this.head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public int size() {
        int count = 0;

        Node<T> temp = head;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void insertNodeAtPosition(int data, int position) {
        if (position < 0 || position > size()) {
            System.out.println("Invalid");
            return;
        }
        Node<T> newNode = new Node(data);

        Node<T> temp = head;

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        }

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void popFirst() {
        if (head == null)
            return;
        head = head.next;
    }

    public void popLast() {
        if (head == null)
            return;

        Node<T> temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public int search(T data) {
        if (head == null) {
            System.out.println("Empty list");
            return 0;
        }

        Node<T> temp = head;

        for (int i = 0; i < size(); i++) {
            if (temp.data.equals(data))
                return i;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Element not found");
        }
        return 0;
    }

    public void insertAfterNode(T data, T prevNodeData) {
        if (head == null)
            return;

        Node<T> newNode = new Node<>(data);
        Node<T> curr_node = head;
        Node<T> next_node = head.next;

        while (curr_node != null) {
            if (curr_node.data.equals(prevNodeData)) {
                curr_node.next = newNode;
                newNode.next = next_node;
                break;
            }

            curr_node = next_node;
            next_node = next_node.next;
        }
    }

    public int deleteNodeWithValue(T data) {
        if (head == null)
            return 0;

        Node<T> prev = head;
        Node<T> curr = head.next;

        while (curr != null) {
            if (curr.data.equals(data)) {
                prev.next = curr.next;
                break;
            }

            prev = curr;
            curr = curr.next;
        }

        return size();

    }

}