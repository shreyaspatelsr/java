
public class ReferenceAssignment {
    // reference variable assignment
    // when ref2 = ref1 then both ref variable point to same object.

    public static void main(String[] args) {
        employee e1 = new employee();
        e1.e_id = 1;
        e1.e_name = "new";
        System.out.println("e_id = " + e1.e_id);
        System.out.println("e_name = " + e1.e_name);
        e1.task();
        employee e2;
        e2 = e1;
        e2.e_id = 10;
        e2.e_name = "mmmm";
        System.out.println("e_id = " + e1.e_id);
        System.out.println("e_name = " + e1.e_name);
        System.out.println(e2.e_id);
        System.out.println(e2.e_name);
        e2.task();

    }
}

class employee {

    int e_id;
    String e_name;

    void task() {
        System.out.println("doing work");
    }
}
