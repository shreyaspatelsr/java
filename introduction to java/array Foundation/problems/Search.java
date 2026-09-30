
import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the array elments");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("enter the search element");
        int key = scan.nextInt();
        boolean sikthu = false;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (key == arr[i]) {
                System.out.println("key found at the position " + (i + 1));
                sikthu = true;
                // break;
            }

        }
        if (!sikthu) {
            System.out.println("array element not found");
        }
    }
}
