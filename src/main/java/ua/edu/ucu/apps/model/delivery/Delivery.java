package ua.edu.ucu.apps.model.delivery;

import java.util.List;

import ua.edu.ucu.apps.flower.Item;

public interface Delivery {
    
    public String deliver(List<Item> items);
}
