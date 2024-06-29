/*Implement a generic Queue data structure in Java using a linked list.  
The Queue should support the basic operations of enqueue, dequeue, peek, and check if the queue is empty?*/

import java.util.*;
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class Queue<T> {
    private Node<T> front; 
    private Node<T> rear; 

    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        T item = front.data;
        front = front.next;
        if (front == null) {
            rear = null; 
        }
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return null;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node<T> current = front;
        System.out.println("Queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class QueueOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new Queue<>();
		System.out.println("Is queue empty? " + queue.isEmpty());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.print();
        System.out.println("Peek element: " + queue.peek());
        System.out.println("Dequeue element: " + queue.dequeue());
        queue.print();
        System.out.println("Is queue empty? " + queue.isEmpty());
	}
}

/*Output:
Is queue empty? true
Queue: 
10 20 30 
Peek element: 10
Dequeue element: 10
Queue: 
20 30 
Is queue empty? false
*/
