package ua.edu.ucu.apps.model;

import java.util.LinkedList;

import ua.edu.ucu.apps.flower.Item;
import ua.edu.ucu.apps.model.delivery.Delivery;
import ua.edu.ucu.apps.model.payment.Payment;

public class Order {

    LinkedList<Item> items;
    Payment payment;
    Delivery delivery;

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

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public void processOrder() {
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
    }
}
