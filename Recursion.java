import java.util.*;

public class Recursion {
    // static void printNum(int n) {
    // while
    // System.out.println(n);
    // printNum(n - 1);

    // }
    public static int firstOcurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcurence(arr, key, i + 1);
    }

    public static int lastOcurence(int arr[], int key, int i) {
        if (i == 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOcurence(arr, key, i - 1);
    }

    public static int power(int no, int pow) {// 0(n)
        if (pow == 1) {
            return no;
        }
        return (no * power(no, pow - 1));
    }

    public static int poweropt(int no, int pow) {// 0(log n)
        if (pow == 1) {
            return no;
        }
        int halfpower = poweropt(no, pow / 2);
        int halfpowersq = halfpower * halfpower;
        if (pow % 2 != 0) {
            halfpowersq = no * halfpowersq;
        }
        return halfpowersq;
    }

    public static void main(String arg[]) {
        // int n = 10;
        // printNum(n);
        // int arr[] = { 1, 4, 3, 6, 3, 6, 8, 9, 5, 4 };
        // System.out.println(firstOcurence(arr, 6, 0));
        // System.out.println(lastOcurence(arr, 6, (arr.length - 1)));
        System.out.println(poweropt(2, 10));
    }
}
