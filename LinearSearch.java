import java.util.Scanner;

public class LinearSearch {
    Scanner sc = new Scanner(System.in);

    public int getArray(int arr[]) {
        System.out.println("Enter Size of array:");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return size;
    }

    public void search(int arr[]) {
        System.out.println("Enter element to search:");
        int x = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }

    public void displayArray(int arr[]) {
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        LinearSearch ls = new LinearSearch();
        int size = ls.getArray(new int[0]); // Initialize with an empty array
        int[] arr = new int[size];
        ls.getArray(arr);
        ls.displayArray(arr);
        ls.search(arr);
    }
}
