import java.util.Scanner;

class car {
    car(int seatNo) {
        System.out.println("car is " + seatNo + " seater !");
    }

    car(int seatNo, String brandName) {
        System.out.println("car is " + seatNo + " seater !");
        System.out.println("& Brand is " + brandName);
    }
}

public class Constructor {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        car c1 = new car(4);
        car c2 = new car(5, "Rolls-Royce");
    }
}
