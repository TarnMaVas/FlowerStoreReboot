package ua.edu.ucu.apps.model;

import java.util.LinkedList;

import ua.edu.ucu.apps.flower.Item;
import ua.edu.ucu.apps.model.delivery.Delivery;
import ua.edu.ucu.apps.model.payment.Payment;

public class Order {

    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item: items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void setPaymentStrategy(Payment newPayment) {
        this.payment = newPayment;
    }

    public void setDeliveryStrategy(Delivery newDelivery) {
        this.delivery = newDelivery;
    }

    public void processOrder() {
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
    }
}
