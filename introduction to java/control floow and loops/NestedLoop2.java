
public class NestedLoop2 {

    public static void main(String[] args) {
        // nested while loop
        int j = 0;
        while (j <= 10) {
            int i = 0;
            while (i <= 10) {
                System.out.println(i);
                i++;
            }
            j++;
        }
    }
}
