package ua.edu.ucu.apps.flower;

public class RomashkaFlower extends Flower {

    public static final float DEF_PRICE = 10;
    public static final float DEF_SEPAL_LENGTH = 30;
    public static final FlowerColor DEF_COLOR = FlowerColor.RED;
    public static final FlowerType DEF_TYPE = FlowerType.CHAMOMILE;
    public static final String DEF_DESC = "a Romashka flower";


    public RomashkaFlower() {
        this.setPrice(DEF_PRICE);
        this.setSepalLength(DEF_SEPAL_LENGTH);
        this.setColor(DEF_COLOR);
        this.setType(DEF_TYPE);
        this.setDescription(DEF_DESC);
    }

}
