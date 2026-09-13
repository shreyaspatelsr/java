
public class Type3 {
    // no parameters and with return type

    public static void main(String[] args) {
        int res = add();
        System.out.println(res);
    }

    static int add() {
        int a = 20;
        int b = 30;
        int res = a + b;
        return res;
    }
}
