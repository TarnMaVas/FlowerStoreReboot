package ua.edu.ucu.apps.flower.decorators;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.flower.Item;

@Getter @Setter
public abstract class ItemDecorator extends Item {
    
    private Item item;
    private int increment;
}
