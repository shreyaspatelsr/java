
class Pgm1 {

    // string builder LENGTH CAPACITY
    // CAPACITY EXPANSANTION FORMULA oldcapacity*2+2
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("java");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("is a programming langauge");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("and object oriented");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
