package ua.edu.ucu.apps.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor @Entity @Table(name = "flower_data")
public class Flower extends FlowerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double price;

    public Flower(Flower flower) {
        this.price = flower.price;
        this.setSepalLength(flower.getSepalLength());
        this.setColor(FlowerColor.getColor(flower.getColor()));
        this.setType(flower.getType());
        this.setDescription("a flower");
    }

    public Flower(double price, double sepalLength,
                 FlowerColor color, FlowerType type) {
        this.setPrice(price);
        this.setSepalLength(sepalLength);
        this.setColor(color);
        this.setType(type);
        this.setDescription("a flower");
    }
}