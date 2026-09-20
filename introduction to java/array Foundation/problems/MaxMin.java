
import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the array elements");
        for (int i = 0; i <= size - 1; i++) {
            System.out.println("enter the " + i + "index element of the array");
            arr[i] = scan.nextInt();

        }
        CalMinMax cmm = new CalMinMax();
        int min = cmm.min(arr);
        int max = cmm.max(arr);
        System.out.println("maximun = " + max);
        System.out.println("minimun = " + min);

    }
}

class CalMinMax {

    int min(int arr[]) {
        int min = arr[1];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    int max(int arr[]) {
        int max = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
