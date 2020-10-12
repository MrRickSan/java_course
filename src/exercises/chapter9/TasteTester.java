package exercises.chapter9;

public class TasteTester {

    public static void main(String []args){

        BirthdayCake birthdayCake = new BirthdayCake();
        WeddingCake weddingCake = new WeddingCake();

        birthdayCake.setCandles(15);
        birthdayCake.setFlavor("Chocolate");
        birthdayCake.setPrice(30.99);

        weddingCake.setTiers(3);
        weddingCake.setFlavor("Love");
        weddingCake.setPrice(99.5);


        System.out.println(birthdayCake.getCandles());
        System.out.println(weddingCake.getTiers());
    }
}
