
import java.util.Scanner;

public class UserInput1 {
    //Scanner inbuilt class used to take data from the user
    //object of the class has to be created 
    //import java.util.Scanner to use the class 
    // Scanner methods
    // nextbyte() to read byte values
    // nextshort() to read short values
    // nextint() to read integer values
    // nextlong() to read long values
    // nextfloat() to read float values
    // nextdouble() to read decimal numbers
    // nextboolean() to read boolean values
    // nextLine() to read sentence including the spaces 
    // next(); to read word not the sentence

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the byte");
        byte a = scan.nextByte();
        System.out.println("the byte is" + a);
        System.out.println("enter the number");
        int b = scan.nextInt();
        System.out.println("the integer is" + b);

    }
}
