package ua.edu.ucu.apps.flower;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @NoArgsConstructor @AllArgsConstructor @MappedSuperclass
public abstract class FlowerInfo extends Item {

    @Getter
    private double sepalLength;

    @Enumerated(EnumType.STRING)
    private FlowerColor color;

    @Getter @Enumerated(EnumType.STRING)
    private FlowerType type;

    public FlowerInfo(FlowerInfo flowerInfo) {
        this.sepalLength = flowerInfo.getSepalLength();
        this.color = flowerInfo.color;
        this.type = flowerInfo.getType();
        this.setDescription("a flower");
    }

    public String getColor() {
        return color.toString();
    }

    public boolean matches(FlowerInfo flowerInfo) {
        return this.sepalLength == flowerInfo.getSepalLength()
               && this.getColor().equals(flowerInfo.getColor())
               && this.type == flowerInfo.getType();
    }

}
