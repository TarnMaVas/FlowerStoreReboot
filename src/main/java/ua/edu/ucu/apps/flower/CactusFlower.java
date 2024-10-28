package ua.edu.ucu.apps.flower;

public class CactusFlower extends Flower {

    public static final float DEF_PRICE = 30;
    public static final float DEF_SEPAL_LENGTH = 5;
    public static final FlowerColor DEF_COLOR = FlowerColor.GREEN;
    public static final FlowerType DEF_TYPE = FlowerType.CACTUS;
    public static final String DEF_DESC = "a Cactus flower";


    public CactusFlower() {
        this.setPrice(DEF_PRICE);
        this.setSepalLength(DEF_SEPAL_LENGTH);
        this.setColor(DEF_COLOR);
        this.setType(DEF_TYPE);
        this.setDescription(DEF_DESC);
    }

}
