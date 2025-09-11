// File: BinarySearch.java
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == key)
                return mid;  // key found
            
            if (arr[mid] < key)
                left = mid + 1;  // search right half
            else
                right = mid - 1; // search left half
        }
        return -1; 
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);

        if (result == -1)
            System.out.println("Element not found!");
        else
            System.out.println("Element found at index: " + result);

        sc.close();
    }
}

