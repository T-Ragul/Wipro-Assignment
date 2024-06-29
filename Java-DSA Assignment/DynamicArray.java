//Create a Java class that implements basic operations on a dynamic array. The class should be able to handle typical array operations such as insertion, deletion, updating, and retrieval of elements?

public class DynamicArray {
    private int[] array;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.array = new int[capacity];
    }

    //Insert an element
    public void insert(int element) {
        if (size == capacity) {
            resize();
        }
        array[size++] = element;
    }

    private void resize() {
        capacity *= 2;
        int[] newArray = new int[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }


	//Delete an element 
    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    // Update an element 
    public void update(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        array[index] = element;
    }

    // Retrieve an element 
    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return -1; 
        }
        return array[index];
    }
    
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
  public static void main(String[] args) {
        DynamicArray array = new DynamicArray(2);
        System.out.println("The Insert Element Is:");
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.print();
        System.out.println("The Update Element Is:");
        array.update(1, 4);
        array.print();
        System.out.println("The Delete Element Is:");
        array.delete(1);
        array.print();
        System.out.println("Element at index 1:\n"+ array.get(1));
   }
}

/*Output:
The Insert Element Is:
1 2 3 
The Update Element Is:
1 4 3 
The Delete Element Is:
1 3 
Element at index 1:
3
*/