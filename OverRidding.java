
public class OverRidding {
    public static void main(String arg[]) {
        Deer d = new Deer();
        d.eat();
    }

}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats anything");
    }
}
