package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flower.CactusFlower;
import ua.edu.ucu.apps.flower.Item;
import ua.edu.ucu.apps.flower.RomashkaFlower;
import ua.edu.ucu.apps.model.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.model.payment.PayPalPaymentStrategy;
import ua.edu.ucu.apps.model.payment.Payment;

public class PaymentTest {
    
    @Test
    public void testNormal() {
        Item item1 = new CactusFlower();
        Item item2 = new RomashkaFlower();

        double price = item1.getPrice() + item2.getPrice();

        Payment payStratPal = new PayPalPaymentStrategy();
        Payment payStratCard = new CreditCardPaymentStrategy();
        String expectedPal = "Paid 40.0 using PayPal";
        String expectedCard = "Paid 40.0 using Credit Card";

        Assertions.assertEquals(expectedCard,
                            payStratCard.pay(price));

        Assertions.assertEquals(expectedPal,
                            payStratPal.pay(price));
    }

    @Test
    public void testEmpty() {
        double price = -5;

        Payment payStratPal = new PayPalPaymentStrategy();
        Payment payStratCard = new CreditCardPaymentStrategy();

        Assertions.assertEquals("Payment error",
                                    payStratPal.pay(price));
        Assertions.assertEquals("Payment error",
                                    payStratCard.pay(price));
    }
}

