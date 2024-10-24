import java.util.Scanner;

public class AllSorting {
    private int[] array;

    // Constructor to initialize the array
    public AllSorting(int[] array) {
        this.array = array;
    }

    // Method to display the array
    public void displayArray() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Bubble Sort
    public void bubbleSort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public void selectionSort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }

    // Insertion Sort
    public void insertionSort() {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        AllSorting sorter = new AllSorting(array);

        System.out.println("Original array:");
        sorter.displayArray();

        sorter.bubbleSort();
        System.out.println("Array after Bubble Sort:");
        sorter.displayArray();

        // Reset array to original input for selection sort
        sorter = new AllSorting(array);
        sorter.selectionSort();
        System.out.println("Array after Selection Sort:");
        sorter.displayArray();

        // Reset array to original input for insertion sort
        sorter = new AllSorting(array);
        sorter.insertionSort();
        System.out.println("Array after Insertion Sort:");
        sorter.displayArray();

        scanner.close();
    }
}
