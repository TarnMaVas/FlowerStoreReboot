package ua.edu.ucu.apps.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flower.CactusFlower;
import ua.edu.ucu.apps.flower.Item;
import ua.edu.ucu.apps.flower.RomashkaFlower;
import ua.edu.ucu.apps.model.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.model.delivery.Delivery;
import ua.edu.ucu.apps.model.delivery.PostDeliveryStrategy;

public class DeliveryTest {

    @Test
    public void testNormal() {
        List<Item> items = new ArrayList<>();
        items.add(new CactusFlower());
        items.add(new RomashkaFlower());

        Delivery delStratPost = new PostDeliveryStrategy();
        Delivery delStratDHL = new DHLDeliveryStrategy();

        String expectedPost = "Delivered 2 items using post."
                              +  " Their descriptions:\n"
                              + "a Cactus flower\n"
                              + "a Romashka flower\n";

        String expectedDHL = "Delivered 2 items using DHL."
                             + " Their descriptions:\n"
                             + "a Cactus flower\n"
                             + "a Romashka flower\n";

        Assertions.assertEquals(expectedPost, delStratPost.deliver(items));
        Assertions.assertEquals(expectedDHL, delStratDHL.deliver(items));
    }
}