public class Queue {

    Node front;
    Node rear;

    // Constructor
    public Queue() {
        this.front = null;
        this.rear = null;
    }

    // Insert element at rear
    public void enQueue(int value) {
        Node newNode = new Node(value);

        // If queue is empty
        if (front == null) {
            front = rear = newNode;
            rear.link = front; // Circular link
        } else {
            rear.link = newNode;
            rear = newNode;
            rear.link = front; // Maintain circular link
        }
    }

    // Remove element from front
    public Integer deQueue() {

        // If queue is empty
        if (front == null) {
            System.out.println("Queue is empty!");
            return null;
        }

        int value;

        // If only one element
        if (front == rear) {
            value = front.data;
            front = rear = null;
        }
        // More than one element
        else {
            value = front.data;
            front = front.link;
            rear.link = front; // Maintain circular link
        }

        return value;
    }

    // Display all elements in queue
    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");

        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != front);

        System.out.println();
    }
}
