package exercises.chapter14;

import java.util.Random;

public class Coin {

    private String side;
    public static final String HEADS = "heads";
    public static final String TAILS = "tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void flip(){
        Random random = new Random();

        if (random.nextBoolean()){
            setSide(HEADS);
        } else {
            setSide(TAILS);
        }
    }
}
