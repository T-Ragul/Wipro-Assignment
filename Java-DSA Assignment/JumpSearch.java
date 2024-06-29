//Implement a Jump Search algorithm in Java to efficiently search for a target value in a sorted array.

public class JumpSearch {
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        for (int i = 0; i < n; i += step) {
            if (arr[Math.min(i + step, n) - 1] >= target) {
                prev = i;
                break;
            }
        }

        for (int i = prev; i < Math.min(prev + step, n); i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5,6,44,52,66,85,93,100};
        int target = 66;
        int index = jumpSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

/*Output:
Element found at index: 9
*/