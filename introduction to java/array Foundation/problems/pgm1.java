
import java.util.Scanner;

public class pgm1 {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arr1[4] = 1000;
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.println(arr1[i]);
        }
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
