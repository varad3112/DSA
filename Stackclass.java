import java.util.ArrayList;
import java.util.Scanner;

public class Stackclass {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to push:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            Stack.push(element);
        }

        System.out.println("Elements in the stack:");
        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }

        scanner.close();
    }
}
