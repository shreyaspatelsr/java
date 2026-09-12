
public class NestedLoop3 {

    public static void main(String[] args) {
        int j = 0;
        do {
            int i = 1;
            do {
                System.out.println(i);
                i++;
            } while (i <= 5);
            j++;
        } while (j < 10);

    }
}
