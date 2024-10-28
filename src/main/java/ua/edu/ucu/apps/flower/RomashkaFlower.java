package ua.edu.ucu.apps.flower;

public class RomashkaFlower extends Flower{

    private final float DEF_PRICE = 10;
    private final float DEF_SEPAL_LENGTH = 30;
    private final FlowerColor DEF_COLOR = FlowerColor.RED;
    private final FlowerType DEF_TYPE = FlowerType.CHAMOMILE;
    private final String DEF_DESC = "a Romashka flower";


    public RomashkaFlower() {
        this.price = DEF_PRICE;
        this.setSepalLength(DEF_SEPAL_LENGTH);
        this.setColor(DEF_COLOR);
        this.setType(DEF_TYPE);
        this.description = DEF_DESC;
    }

}
