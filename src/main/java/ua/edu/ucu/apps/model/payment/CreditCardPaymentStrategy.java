package ua.edu.ucu.apps.model.payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public String pay(double amount) {

        if (amount > 0) {return "Paid " + amount + " using Credit Card";}

        return "Payment error";
    }
    
}
