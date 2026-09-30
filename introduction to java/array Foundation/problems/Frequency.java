
import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the  array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        Mode m1 = new Mode();
        System.out.println("enter the key of the array");
        int key = scan.nextInt();
        int frequency = m1.mode1(arr, key);
        int frequency1 = m1.mode1(arr, 2);
        System.out.println("the frequency of the key " + frequency);
        System.out.println("the frequency of the key " + frequency1);
        m1.modeOfEach(arr);
    }

}

class Mode {

    int mode1(int arr[], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
    }

    void modeOfEach(int arr[]) {
        boolean visited[] = new boolean[arr.length];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occur " + count + " times");
        }
    }
}
