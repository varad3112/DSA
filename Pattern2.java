import java.util.Scanner;

public class Pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int result = '*';
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int columns = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
