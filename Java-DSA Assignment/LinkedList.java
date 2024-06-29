/*Implement a `LinkedList` class in Java with methods to
add, remove, retrieve, and display elements, ensuring efficient handling of edge cases without using Java's built-in collection classes? */

import java.util.*;
public class LinkedList {
	class Node{
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public int get(int index) {
        Node current = head;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex == index) {
                return current.data;
            }
            current = current.next;
            currentIndex++;
        }
        throw new IndexOutOfBoundsException("Index " + index + " not found.");
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

 public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        System.out.print("Added List is : ");
        li.display();
        li.remove(5);
        System.out.print("List after removing 5: ");
        li.display();
        System.out.println("Element at index 3: " + li.get(3));
        System.out.print("Final List Is : ");
        li.display();
    }
}

/*Output:
Added List is : 1 2 3 4 5 6 
List after removing 5: 1 2 3 4 6 
Element at index 3: 4
Final List Is : 1 2 3 4 6 
*/