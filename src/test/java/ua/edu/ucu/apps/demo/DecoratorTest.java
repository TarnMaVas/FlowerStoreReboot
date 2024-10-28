package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flower.CactusFlower;
import ua.edu.ucu.apps.flower.Item;
import ua.edu.ucu.apps.flower.decorators.BasketDecorator;
import ua.edu.ucu.apps.flower.decorators.PaperDecorator;
import ua.edu.ucu.apps.flower.decorators.RibbonDecorator;

public class DecoratorTest {

    public static final int RIBBON_INCREMENT = 40;
    public static final int BASKET_INCREMENT = 4;
    public static final int PAPER_INCREMENT = 13;

    @Test
    public void testPrice() {

        Item cactus = new CactusFlower();

        double expPaper = cactus.getPrice() + PAPER_INCREMENT;
        double expBasket = cactus.getPrice() + BASKET_INCREMENT;
        double expRibbon = cactus.getPrice() + RIBBON_INCREMENT;

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