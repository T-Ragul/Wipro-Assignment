//Implement a Java method that performs a linear search on an array of integers, returning the index of the target value if found or -1 if not ?
//I have done with User Inputs.

import java.util.Scanner;
public class LinearSearch{

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value to search: ");
        int target = sc.nextInt();
        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

/*Output:
Enter the number of elements in the array: 5
Enter the elements of the array:
1
3
5
3
5
Enter the target value to search: 3
Element 3 found at index 1
*/