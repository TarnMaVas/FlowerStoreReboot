package ua.edu.ucu.apps.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flower.CactusFlower;
import ua.edu.ucu.apps.flower.Item;
import ua.edu.ucu.apps.flower.RomashkaFlower;
import ua.edu.ucu.apps.model.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.model.payment.Payment;

@RestController
public class PaymentController {

    Payment paymentStrat;

    public PaymentController() {
        this.paymentStrat = new CreditCardPaymentStrategy();
    }

    @GetMapping("/payment")
    public String getDelivery() {
        Item item1 = new CactusFlower();
        Item item2 = new RomashkaFlower();

        double price = item1.getPrice() + item2.getPrice();
        return paymentStrat.pay(price) + '\n' + "Payment completed";
    }

    public void setPayment(Payment payment) {
        this.paymentStrat = payment;
    }
}