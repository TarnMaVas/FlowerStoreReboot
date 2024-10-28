package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flower.CactusFlower;
import ua.edu.ucu.apps.flower.Item;
import ua.edu.ucu.apps.flower.decorators.BasketDecorator;
import ua.edu.ucu.apps.flower.decorators.PaperDecorator;
import ua.edu.ucu.apps.flower.decorators.RibbonDecorator;

public class DecoratorTest {

    @Test
    public void testPrice() {

        Item cactus = new CactusFlower();

        double expPaper = cactus.getPrice() + 13;
        double expBasket = cactus.getPrice() + 4;
        double expRibbon = cactus.getPrice() + 40;

        Item paperCactus = new PaperDecorator(cactus);
        Item basketCactus = new BasketDecorator(cactus);
        Item ribbonCactus = new RibbonDecorator(cactus);

        Assertions.assertEquals(expPaper, paperCactus.getPrice());
        Assertions.assertEquals(expBasket, basketCactus.getPrice());
        Assertions.assertEquals(expRibbon, ribbonCactus.getPrice());
    }

    @Test
    public void testDescription() {
        Item cactus = new CactusFlower();

        String paperDesc = cactus.getDescription() + " with paper";
        String basketDesc = cactus.getDescription() + " with basket";
        String ribbonDesc = cactus.getDescription() + " with ribbon";

        Item paperCactus = new PaperDecorator(cactus);
        Item basketCactus = new BasketDecorator(cactus);
        Item ribbonCactus = new RibbonDecorator(cactus);

        Assertions.assertEquals(paperDesc, paperCactus.getDescription());
        Assertions.assertEquals(basketDesc, basketCactus.getDescription());
        Assertions.assertEquals(ribbonDesc, ribbonCactus.getDescription());
    }
}