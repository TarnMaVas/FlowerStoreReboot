package ua.edu.ucu.apps.flower;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor
public class Flower extends FlowerInfo {

    protected double price;

    public Flower(Flower flower) {
        this.price = flower.price;
        this.setSepalLength(flower.getSepalLength());
        this.setColor(FlowerColor.getColor(flower.getColor()));
        this.setType(flower.getType());
        this.description = "a flower";
    }

    public Flower(double price, double sepalLength,
                 FlowerColor color, FlowerType type) {
        this.setPrice(price);
        this.setSepalLength(sepalLength);
        this.setColor(color);
        this.setType(type);
        this.description = "a flower";
    }
}