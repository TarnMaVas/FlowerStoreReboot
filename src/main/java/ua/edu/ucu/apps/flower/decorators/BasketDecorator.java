package ua.edu.ucu.apps.flower.decorators;

import ua.edu.ucu.apps.flower.Item;

public class BasketDecorator extends ItemDecorator {
    public static final int BASKET_INCREMENT = 4;

    public BasketDecorator(Item item) {
        this.setItem(item);
        this.setIncrement(BASKET_INCREMENT);
    }

    @Override
    public double getPrice() {
        return getItem().getPrice() + getIncrement();
    }

    @Override
    public String getDescription() {
        return getItem().getDescription() + " with basket";
    }
    
}
