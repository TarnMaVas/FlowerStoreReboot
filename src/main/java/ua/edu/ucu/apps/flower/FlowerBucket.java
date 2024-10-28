package ua.edu.ucu.apps.flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {

    private final List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
        this.setDescription("Flower bucket");

    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public void addFlowers(List<FlowerPack> newFlowerPacks) {
        this.flowerPacks.addAll(newFlowerPacks);
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
