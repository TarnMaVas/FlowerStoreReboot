package ua.edu.ucu.apps.flower.decorators;

import ua.edu.ucu.apps.flower.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 13;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " with paper";
    }
    
}
