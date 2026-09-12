
import java.util.Scanner;

public class UserInput2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scan.nextInt();
        System.out.println("number is" + a);
        System.out.println("enter a height");
        float b = scan.nextFloat();
        System.out.println("the height is " + b);
        scan.nextLine();
        System.out.println("enter the name");
        String c = scan.nextLine();
        System.out.println("the name is " + c);

    }
}
