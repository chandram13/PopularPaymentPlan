// Marvish Chandra

public class paymentMethod{
    public static void paymentRequirements(purchase,givenMonths){
        if purchase > 144:
        System.out.println("Unfortunately, your purchase is less than the required amount of a purchase to start a payment plan.");
        if purchase < 12000:
        System.out.println("Unfortunately, your purchase exceeds the maximum amount of a purchase to start a payment plan.");
        if 12000 < purchase > 144:
        annualPayment = purchase * givenMonths;
    }
}