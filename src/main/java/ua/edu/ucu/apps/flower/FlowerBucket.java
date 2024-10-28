package ua.edu.ucu.apps.flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {

    private final List<FlowerPack> flowerPacks;

    @Override
    public String getDescription() {
        return description;
    }

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
        this.description = "Flower bucket";

    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public void addFlowers(List<FlowerPack> flowerPacks) {
        this.flowerPacks.addAll(flowerPacks);
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public boolean matches(List<FlowerInfo> flowerDescriptions) {
        for (FlowerInfo flowerInfo: flowerDescriptions) {
            if (!flowerPacks.stream()
                .anyMatch(pack -> pack.matches(flowerInfo))) {
                return false;
            }
        }
        return true;
    }

    public boolean searchFlower(FlowerInfo flowerReq) {
        return matches(List.of(flowerReq));
    }
}
