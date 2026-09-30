
public class BookApp2 {

    public static void main(String[] args) {
        Book pn = new Book();
        pn.setData(-100);
        pn.getData();
    }
}

class Book {

    private int pageNum;

    public void setData(int x) {
        if (x > 0) {
            pageNum = x;
        }

    }

    public void getData() {
        System.out.println(pageNum);
    }
}
