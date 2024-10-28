package ua.edu.ucu.apps.model.payment;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public String pay(double amount) {

        if (amount > 0) {return "Paid " + amount + " using PayPal";}

        return "Payment error";
    }
    
}
