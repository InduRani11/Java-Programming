import java.util.*;

public class pattern {
    public static void main(String args[]) {

        /*
         * {
         * System.out.print("****\n***\n**\n*");
         * }
         */
        // making hollow rectangle
        /*
         * {
         * Scanner sc = new Scanner(System.in);
         * int n = 4;
         * for (int i = 1; i <= n; i++) {
         * if (i == 1) {
         * System.out.println("*****");
         * } else if (i == n) {
         * System.out.println("*****");
         * } else {
         * System.out.println("*   *");
         * }
         * }
         * }
         */
        /*
         * {
         * Scanner sc = new Scanner(System.in);
         * int n = 4;
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print(*);
         * }
         * System.out.print("\n");
         * }
         * }
         */
        /*
         * {
         * Scanner sc = new Scanner(System.in);
         * for (int i = 0; i <= 3; i++) {
         * for (int j = 0; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.print("\n");
         * }
         * }
         */

        {
            // Scanner sc = new Scanner(System.in);
            // for (int i = 1; i <= 4; i++) {
            // for (int j = 4 - i + 1; j > 0; j--) {
            // System.out.print("*");
            // }
            // System.out.print("\n");
            // }

            // for (int i = 1; i <= 5; i++) {
            // for (int j = 0; j < 5 - i; j++) {
            // System.out.print(" ");
            // }
            // for (int j = 5 - i; j < 5 + i; j++) {
            // if ((j % 2 == 0 && i % 2 == 0) || (j % 2 != 0 && i % 2 != 0))
            // System.out.print(i);
            // else
            // System.out.print(" ");
            // }
            // System.out.println();
            // }
            /*
             * for (int i = 1; i <= 5; i++) {
             * for (int j = 1; j <= 5 - i; j++) {
             * System.out.print(" ");
             * }
             * int n = i;
             * for (int j = 6 - i; j < 5; j++) {
             * System.out.print(n--);
             * 
             * }
             * for (int j = 6; j < 6 + i; j++) {
             * System.out.print(n++);
             * }
             * System.out.println();
             * }
             */

            for (int i = 1; i <= 4; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }

                for (int j = i; j < 8 - i; j++) {
                    System.out.print(" ");

                }
                for (int j = 8 - i; j < 8; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }
            for (int i = 0; i <= 4; i++) {
                for (int j = 0; j < 4 - i; j++) {
                    System.out.print("*");
                }

                for (int j = 4 - i; j < 4 + i; j++) {
                    System.out.print(" ");

                }
                for (int j = 4 + i; j < 8; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }
        }
    }
}