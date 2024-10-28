package ua.edu.ucu.apps.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.flower.CactusFlower;
import ua.edu.ucu.apps.flower.Item;
import ua.edu.ucu.apps.flower.RomashkaFlower;
import ua.edu.ucu.apps.model.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.model.payment.Payment;

@RestController @Getter @Setter
public class PaymentController {

    private Payment paymentStrat;

    public PaymentController() {
        this.paymentStrat = new CreditCardPaymentStrategy();
    }

    @GetMapping("/payment")
    public String getDelivery() {
        Item itemA = new CactusFlower();
        Item itemB = new RomashkaFlower();

        double price = itemA.getPrice() + itemB.getPrice();
        return paymentStrat.pay(price) + '\n' + "Payment completed";
    }

    public void setPayment(Payment payment) {
        this.paymentStrat = payment;
    }
}