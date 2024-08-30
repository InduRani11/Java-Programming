import java.util.*;

class A {
    void sum(int a, int b) {
        System.out.println("sum = " + (a + b));
    }
}

class B extends A {
    void sub(int a, int b) {
        System.out.println("sub = " + (a - b));
    }
}

class C extends B {
    void multi(int a, int b) {
        System.out.println("multiplication = " + (a * b));
    }
}

public class Inheritance {
    public static void main(String arg[]) {
        C a1 = new C();
        a1.sum(53, 45);
        a1.sub(76, 34);
        a1.multi(25, 67);

    }
}
