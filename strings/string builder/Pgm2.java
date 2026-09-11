
public class Pgm2 {
// allocating capacity 

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("java");
        System.out.println(sb1);
        sb1.append("program");
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder();
        sb2.ensureCapacity(100);
        System.out.println(sb2.capacity());

    }
}
