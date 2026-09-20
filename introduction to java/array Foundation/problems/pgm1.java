
import java.util.Scanner;

public class pgm1 {

    public static void main(String[] args) {
        SumOfArray a1 = new SumOfArray();
        System.out.println("Enter the Size of array elements:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the array elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("entered array elements are ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
        int sum = a1.sum(arr);
        System.out.println("Sum of array elements is: " + sum);

    }
}

class SumOfArray {

    int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}




    
    