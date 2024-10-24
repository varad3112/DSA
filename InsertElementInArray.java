import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        int i, n, num, pos;
        int[] arr = new int[20];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        n = scanner.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("\narr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to be inserted: ");
        num = scanner.nextInt();

        System.out.print("Enter the position at which the number has to be inserted: ");
        pos = scanner.nextInt();

        // Check if position is valid
        if (pos < 0 || pos > n) {
            System.out.println("Invalid position! Please enter a position between 0 and " + n);
            return;
        }

        // Shift elements to the right to make room for the new element
        for (i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element
        arr[pos] = num;

        // Increase the size of the array
        n++;

        // Print the array after insertion
        System.out.print("The array after insertion is: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
