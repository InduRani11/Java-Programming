import java.util.Scanner;

public class function {
    /*
     * 1. public static void printHelloWorld() {
     * System.out.println("Hello World");
     * System.out.println("Hello World");
     * System.out.println("Hello World");
     * }
     */
    /*
     * 2.
     * public static int sum(int a, int b) {
     * int sum = a + b;
     * return sum;
     * }
     */
    /*
     * 3. public static void swap(int a, int b) {
     * // swap code
     * int temp;
     * temp = a;
     * a = b;
     * b = temp;
     * System.out.println("a=" + a);
     * System.out.println("b=" + b);
     * }
     */
    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        return fact;

    }

    public static int combination(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_M_r_fact = factorial(n - r);

        return (n_fact / (r_fact * n_M_r_fact));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // 1. printHelloWorld();
        // 1. printHelloWorld();
        // 2. System.out.println("enter a and b");
        // 2.int a = sc.nextInt();
        // 2. int b = sc.nextInt();
        // 2. System.out.println("sum = " + sum(a, b));
        // 3. swap(a, b);
        // 3. System.out.println("a=" + a);
        // 3.System.out.println("b=" + b);
        System.out.println("enter n = ");
        int n = sc.nextInt();
        System.out.println("enter r = ");
        int r = sc.nextInt();

        int ncr = combination(n, r);
        System.out.println(ncr);

    }
}
