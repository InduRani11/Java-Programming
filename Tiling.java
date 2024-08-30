import java.util.*;

public class Tiling {
    public static int waysoftiling(int n) {// 2*n (floar size)
        if (n == 0 || n == 1) {
            return 1;
        }
        // verticle choice
        int verticletile = waysoftiling(n - 1);
        // horizontal choice
        int horizontalTile = waysoftiling(n - 2);
        return verticletile + horizontalTile;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // floar size = 2*n
        // have to find no of ways of arangement of tiles of 2*1 size in different order
        // int n=sc.nextInt();
        System.out.println(waysoftiling(8));
    }
}
