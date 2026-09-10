
public class Pgm3 {
// inrest at specific position delete reverse

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("java");
        System.out.println(sb1);
        sb1.append("program");
        System.out.println(sb1);
        sb1.insert(0, "python");
        System.out.println(sb1);
        sb1.delete(0, 4);
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);

    }
}
