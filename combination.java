import java.util.Scanner;

public class combination {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        return fact;

    }

    public static int combn(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_M_r_fact = factorial(n - r);
        return (n_fact / (r_fact * n_M_r_fact));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n = ");
        int n = sc.nextInt();
        System.out.print("enter r = ");
        int r = sc.nextInt();
        int ncr = combn(n, r);
        System.out.println(n + "C" + r + "=" + ncr);
    }

}
