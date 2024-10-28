package ua.edu.ucu.apps.flower.decorators;

import ua.edu.ucu.apps.flower.Item;

public class PaperDecorator extends ItemDecorator {

    public static final int PAPER_INCREMENT = 13;

    public PaperDecorator(Item item) {
        this.setItem(item);
        this.setIncrement(PAPER_INCREMENT);
    }


    @Override
    public double getPrice() {
        return getItem().getPrice() + getIncrement();
    }

    @Override
    public String getDescription() {
        return getItem().getDescription() + " with paper";
    }
    
}
