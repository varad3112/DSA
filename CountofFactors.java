import java.util.*;

public class CountofFactors {

    public static int countoffactors1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;

    }

    // Optimized function
    public static int countOfFactors2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                count = count + 2;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int result = countoffactors1();
        System.out.print("Count of factors =" + result);

        int result2 = countOfFactors2();
        System.out.println("Count of factors =" + result2);
    }
}
