
public class Pgm {

    public static void main(String[] args) {
        // for single class we can create multiple objects.
        // for multiple class we can create multiple objects.
        // why we need to put f after the float number ?
        // if we don't put f after the float number it will be treated as double by default.
        student s1 = new student();
        student s2 = new student();
        s1.roll = 1;
        s1.name = "shreyas";
        s1.age = 23;
        s1.height = 5.10f;
        s1.run();
        s1.sleep();
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.height);
        System.out.println(s1);
        s2.run();
        s2.sleep();
        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.height);
        System.out.println(s2);

    }
}

class student {

    int roll;
    String name;
    int age;
    float height;

    void run() {
        System.out.println("runing");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}
