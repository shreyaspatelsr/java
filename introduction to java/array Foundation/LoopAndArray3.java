
import java.util.Scanner;

public class LoopAndArray3 {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the 5 array elements");
        int a[] = new int[5];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }

        int b[] = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[j] = a[i];
            j++;

        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

}
