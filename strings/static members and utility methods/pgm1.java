
public class pgm1 {

    public static void main(String[] args) {
        Demo o1 = new Demo();
        Demo o2 = new Demo();
        Demo o3 = new Demo();
        System.out.println(" number of objects created" + Demo.count);

    }
}

class Demo {

    static int count = 0;

    {
        count++;

    }
}
