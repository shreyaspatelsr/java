
import java.util.Scanner;

public class Prgm2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scan.nextInt();
        if (num > 99) {
            System.out.println("it is greater");
        } else {
            System.out.println(" is not greater");
        }
    }
}
