
import java.util.Scanner;

public class LoopAndArray1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = {1, 2, 3, 4, 5, 6, 70};
        System.out.println("enter the values");
        // read arry elements
        for (int i = 0; i <= 4; i++) {
            a[i] = scan.nextInt();
        }
        // read arry elements in fwd direction
        for (int i = 0; i <= 4; i++) {
            System.out.println(a[i]);
        }
        // read arry elements in reverse direction
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
        // advance loop for reading array elements
        for (int x : b) {
            System.out.print(x + " ");

        }
    }
}
