package exercises.chapter6;

public class PhoneBillCalculatorEnhanced {

    public static void main(String []args){
        PhoneBill phoneBill = new PhoneBill();
        phoneBill.setUsedMinutes(309);

        System.out.println("Phone Bill Statement");
        System.out.println("Plan id: $" + phoneBill.getId());
        System.out.println("Plan: $" + phoneBill.getBaseCost());
        System.out.println("Overage: $" + phoneBill.calculateOverageMinutes());
        System.out.printf("Tax: $%.2f\n", phoneBill.taxFee());
        System.out.printf("Total: $%.2f\n", phoneBill.total());
    }
}
