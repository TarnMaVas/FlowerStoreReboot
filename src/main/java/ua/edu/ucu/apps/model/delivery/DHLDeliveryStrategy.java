package ua.edu.ucu.apps.model.delivery;

import java.util.List;

import ua.edu.ucu.apps.flower.Item;

public class DHLDeliveryStrategy implements Delivery {
        
    @Override
    public String deliver(List<Item> items) {

        if (!items.isEmpty()) {
            StringBuilder details = new StringBuilder();
            details.append("Delivered ").append(items.size())
                .append(" items using DHL. Their descriptions:\n");

            for (Item item : items) {
                details.append(item.getDescription()).append("\n");
            }
            
            return details.toString();
        }

        return "No items to deliver";
    }
}
