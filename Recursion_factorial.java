import java.util.*;

public class Recursion {
    public static int fact(int n) {
        while (n > 1) {
            n = n * fact(n - 1);
            break;
        }

        return n;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fact(n);
        System.out.println(res);

    }

}
