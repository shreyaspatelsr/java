
class Prgm3 {
// String to char array

    public static void main(String[] args) {
        String s1 = "java";
        System.out.println(s1);
        char arr[] = s1.toCharArray();
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);

        }
        String res = new String(arr);
        System.out.println(res);
    }
}
