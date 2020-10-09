package exercises.chapter6;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int usedMinutes;

    public PhoneBill(){
        setId(1);
        setBaseCost(82.45);
        setAllottedMinutes(300);
        setUsedMinutes(0);
    }

    public PhoneBill(int id){
        setId(id);
        setBaseCost(82.45);
        setAllottedMinutes(300);
        setUsedMinutes(0);
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int usedMinutes){
        setId(id);
        setBaseCost(baseCost);
        setAllottedMinutes(allottedMinutes);
        setUsedMinutes(usedMinutes);
    }

    public int getId(){
        return id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public int getUsedMinutes(){
        return usedMinutes;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public void setUsedMinutes(int usedMinutes){
        this.usedMinutes = usedMinutes;
    }

    public int getOverageMinutes(){
        if (usedMinutes < allottedMinutes) return 0;
        else return usedMinutes - allottedMinutes;
    }

    public double calculateOverageMinutes(){
        final double rate = 0.25;
        return getOverageMinutes() * rate;
    }

    public double subtotal(){
        return calculateOverageMinutes() + baseCost;
    }

    public double taxFee(){
        final double rate = 0.15;
        return subtotal() * rate;
    }

    public double total(){
        return taxFee() + baseCost;
    }
}
