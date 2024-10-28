package ua.edu.ucu.apps.flower.decorators;

import ua.edu.ucu.apps.flower.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 4;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " with basket";
    }
    
}
