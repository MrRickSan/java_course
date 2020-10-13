package chapter11;

public class Customer {

    public static void main(String []args){

        Book book = new Book();
        book.setPages(200);
        System.out.println(book.barcode());
    }
}
