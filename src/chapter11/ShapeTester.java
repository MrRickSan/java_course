package chapter11;

public class ShapeTester {

    public static void main(String []args){

        Shape rectangle = new Rectangle(2, 4);
        rectangle.print();
        double area = rectangle.calculateArea();
        System.out.println(area);
    }
}
