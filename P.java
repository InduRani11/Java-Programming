import java.util.*;

// class Bs {
//     public void area(int length, int breadth) {
//         int area = length * breadth;
//         System.out.println("area = " + area);
//     }

//     public void perimeter(int length, int breadth) {
//         int perimeter = 2 * (length + breadth);
//         System.out.println("perimeter = " + perimeter);
//     }
// }

public class P {

    // public static void main(String arg[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter first integer : ");
    // int a = sc.nextInt();
    // System.out.print("Enter second integer : ");
    // int b = sc.nextInt();
    // System.out.println("Sum =" + (a + b));
    // System.out.println("Subtraction =" + (a - b));
    // System.out.println("Multiplication =" + (a * b));
    // System.out.println("division =" + (a / b));

    // }
    // public static void main(String arg[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the length and breadth of room");
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // Bs a1 = new Bs();
    // a1.area(a, b);
    // a1.perimeter(a, b);
    // }
    public static void main(String[] args) {
        int odd_sum = 0, even_sum = 0;
        int arr[] = { 1, 2, 4, 3, 9, 5, 6, 7, 8, };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even_sum = even_sum + arr[i];
            } else {
                odd_sum = odd_sum + arr[i];
            }
        }
        System.out.println("Odd sum=" + odd_sum + "  & Even sum = " + even_sum);
        return;
    }
}
