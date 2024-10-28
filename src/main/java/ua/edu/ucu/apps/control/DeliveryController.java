package ua.edu.ucu.apps.control;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flower.CactusFlower;
import ua.edu.ucu.apps.flower.Item;
import ua.edu.ucu.apps.flower.RomashkaFlower;
import ua.edu.ucu.apps.model.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.model.delivery.Delivery;


@RestController
public class DeliveryController {

    Delivery deliveryStrat;
    public DeliveryController() {
        this.deliveryStrat = new DHLDeliveryStrategy();
    }

    @GetMapping("/delivery")
    public String getDelivery() {
        List<Item> items = new ArrayList<>();
        items.add(new CactusFlower());
        items.add(new RomashkaFlower());
        return deliveryStrat.deliver(items) + '\n' + "Delivery completed";
    }
    public void setDelivery(Delivery delivery) {
        this.deliveryStrat = delivery;
    }
}
