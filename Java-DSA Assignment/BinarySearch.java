//Implement a binary search algorithm in Java that takes a sorted array of integers and a target value, and returns the index of the target if found or -1 if not found ?
//I have done with User Inputs.

import java.util.Scanner;
public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements In the Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value to search: ");
        int target = sc.nextInt();
        sc.close();
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

/*Output:
Enter the number of elements in Array: 5
Enter the elements In the Array:
4
3
5
1
2
Enter the target value to search: 5
Element 5 found at index 2
*/

