
public class Pgm4 {

    // tostring method produces a immutable string type
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("raja");
        System.out.println(sb);
        String res = sb.toString();
        System.out.println(res);
        res = res.concat("rani");
        System.out.println(res);
    }
}
