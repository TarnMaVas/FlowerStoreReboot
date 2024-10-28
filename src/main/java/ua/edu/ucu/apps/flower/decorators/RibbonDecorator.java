package ua.edu.ucu.apps.flower.decorators;

import ua.edu.ucu.apps.flower.Item;

public class RibbonDecorator extends ItemDecorator {

    public static final int RIBBON_INCREMENT = 40;

    public RibbonDecorator(Item item) {
        this.setItem(item);
        this.setIncrement(RIBBON_INCREMENT);
    }


    @Override
    public double getPrice() {
        return getItem().getPrice() + getIncrement();
    }

    @Override
    public String getDescription() {
        return getItem().getDescription() + " with ribbon";
    }
    
}
