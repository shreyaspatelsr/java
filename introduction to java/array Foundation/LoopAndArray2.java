
import java.util.Scanner;

public class LoopAndArray2 {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the 5 array elements");
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[a.length];
        for (int i = 0; i < a.length - 1; i++) {
            b[i] = a[i];
        }
    }

}
