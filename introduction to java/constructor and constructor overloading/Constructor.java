
public class Constructor {

    public static void main(String[] args) {
        // properties of constructor 
        // 1. no return type including void  
        // 2.constructor name same as class name 
        // 3.constructor by default it will be under the public category
        Student s1 = new Student("raja", 25, 5.5);
        s1.display();
    }
}

class Student {

    String name;
    int age;
    double height;

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);

    }
}
