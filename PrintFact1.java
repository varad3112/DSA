
class printFact1 {
    public static int printFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int fact = printFact(n - 1);
        int fact_num = n * fact;
        return fact_num;
    }

    public static void main(String args[]) {
        printFact(5);
    }
}