import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int n = stack.size();
        System.out.println("Enter size of Array:");
        n = sc.nextInt();
        // System.out.println("Enter size of Array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number to add in stack:");
            int number = sc.nextInt();
            stack.push(number);
            System.out.println(number + "added to stack");
        }

        int top = stack.peek();
        System.out.println("Top of the stack is :" + top);

        int popped = stack.pop();
        System.out.println(popped + "is element is popped" + stack.peek());

    }
}
