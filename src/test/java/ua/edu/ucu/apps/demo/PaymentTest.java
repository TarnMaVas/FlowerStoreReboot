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
    
    public static final int BAD_PRICE = -5;
    @Test
    public void testNormal() {
        Item itemA = new CactusFlower();
        Item itemB = new RomashkaFlower();

        double price = itemA.getPrice() + itemB.getPrice();

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

        Payment payStratPal = new PayPalPaymentStrategy();
        Payment payStratCard = new CreditCardPaymentStrategy();

        Assertions.assertEquals("Payment error",
                                    payStratPal.pay(BAD_PRICE));
        Assertions.assertEquals("Payment error",
                                    payStratCard.pay(BAD_PRICE));
    }
}

