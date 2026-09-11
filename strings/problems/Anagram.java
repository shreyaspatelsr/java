
import java.util.Arrays;
import java.util.Scanner;
// anagram

public class Anagram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        if (s1.length() != s2.length()) {
            System.out.println("Strings Are not Anagram");
            return;
        } else {
            System.out.println("strings are  anagrams");
        }
        char strArr1[] = s1.toCharArray();
        char strArr2[] = s2.toCharArray();
        Arrays.sort(strArr1);
        Arrays.sort(strArr2);
        String sortedS1 = new String(strArr1);
        String sortedS2 = new String(strArr2);
        if (sortedS1.equalsIgnoreCase(sortedS2)) {
            System.out.println("strings are anagram");
        } else {
            System.out.println("strings are not anagram");
        }

    }
}
