package ua.edu.ucu.apps.flower;

public class CactusFlower extends Flower {

    private final float DEF_PRICE = 30;
    private final float DEF_SEPAL_LENGTH = 5;
    private final FlowerColor DEF_COLOR = FlowerColor.GREEN;
    private final FlowerType DEF_TYPE = FlowerType.CACTUS;
    private final String DEF_DESC = "a Cactus flower";


    public CactusFlower() {
        this.price = DEF_PRICE;
        this.setSepalLength(DEF_SEPAL_LENGTH);
        this.setColor(DEF_COLOR);
        this.setType(DEF_TYPE);
        this.description = DEF_DESC;
    }

}
