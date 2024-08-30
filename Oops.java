public class Oops {
    public static void main(String arg[]) {
        Student s = new Student();
        s.name = "aman";
        System.out.println(s.name);
    }

}

class Student {
    String name;
    int marks;
}
