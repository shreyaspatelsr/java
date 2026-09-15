
import java.util.Scanner;

public class LoopAndArray1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("enter the values");
        for (int i = 0; i <= 4; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println(a[i]);
        }
    }
}
