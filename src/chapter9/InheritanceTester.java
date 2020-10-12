package chapter9;

public class InheritanceTester {

    public static void main(String []args){

        Employee employee = new Employee();

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("Square");

        Woman mom = new Mother();
        mom.setName("Edlene");
        System.out.println(mom.getName() + " is a " + mom.getGender());
    }
}
