/*Implement a stack data structure in Java. A stack is a linear data structure that follows the Last In First Out (LIFO) principle. Your task is to create a class Stack that supports the following operations:
push(element): Add an element to the top of the stack.
pop(): Remove and return the top element of the stack. If the stack is empty, return an appropriate error message or exception.
peek(): Return the top element of the stack without removing it. If the stack is empty, return an appropriate error message or exception.
isEmpty(): Return true if the stack is empty, otherwise return false.
size(): Return the number of elements in the stack.*/

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];
    
    boolean isEmpty() {
        return (top < 0);
    }
    
    Stack() {
        top = -1;
    }
    
    boolean push(int x) {
        if(top >= (MAX-1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }
    
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }
    
    int peek() {
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }
    
    int size() {
        return top + 1;
    }
    
    void print() {
        for(int i = top; i > -1; i--) {
            System.out.println(" " + a[i]);
        }
    }
}

public class StackOperation {

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println("Is stack empty? " + s.isEmpty()); 
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("Stack Push Elements are: ");
        s.print();
        System.out.println("Stack Pop LIFO Order: ");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("The Current Stack Elements Are:");
        s.print();
        System.out.println("Peek Element: ");
        System.out.println(s.peek());
        System.out.println("Stack size is: " + s.size());
        System.out.println("Is stack empty : " + s.isEmpty());
    }
}

/*Output:
Is stack empty? true
Stack Push Elements are: 
 50
 40
 30
 20
 10
Stack Pop LIFO Order: 
50 Popped from stack
The Current Stack Elements Are:
 40
 30
 20
 10
Peek Element: 
40
Stack size is: 4
Is stack empty : false
*/