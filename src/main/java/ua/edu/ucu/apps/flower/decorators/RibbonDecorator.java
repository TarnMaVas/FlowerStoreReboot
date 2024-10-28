package ua.edu.ucu.apps.flower.decorators;

import ua.edu.ucu.apps.flower.Item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 40;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " with ribbon";
    }
    
}
