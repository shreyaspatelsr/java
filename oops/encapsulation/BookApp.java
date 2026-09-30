
public class BookApp {

    public static void main(String[] args) {
        Book pn = new Book();
        pn.setData(-100);
        pn.getData();
    }
}

class Book {

    private int pageNum;

    public void setData(int x) {
        pageNum = x;
    }

    public void getData() {
        System.out.println(pageNum);
    }
}
