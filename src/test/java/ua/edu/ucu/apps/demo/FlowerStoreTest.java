package ua.edu.ucu.apps.demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flower.Flower;
import ua.edu.ucu.apps.flower.FlowerBucket;
import ua.edu.ucu.apps.flower.FlowerColor;
import ua.edu.ucu.apps.flower.FlowerInfo;
import ua.edu.ucu.apps.flower.FlowerPack;
import ua.edu.ucu.apps.flower.FlowerStore;
import ua.edu.ucu.apps.flower.FlowerType;

public class FlowerStoreTest {

    private static final int DEFAULT_PRICE = 10;
    private static final int DEFAULT_LENGTH = 5;
    private static final int DEFAULT_COUNT = 5;

    private FlowerStore flowerStore;

    @BeforeEach
    public void init() {
        flowerStore = new FlowerStore();
    }

    @Test
    public void testSearch() {
        Flower flowerA = new Flower(DEFAULT_PRICE, DEFAULT_LENGTH,
                                    FlowerColor.RED, FlowerType.ROSE);
        Flower flowerB = new Flower(DEFAULT_PRICE, DEFAULT_LENGTH, 
                                    FlowerColor.BLUE, FlowerType.TULIP);
        FlowerInfo flowerInfoA = new Flower(DEFAULT_PRICE, DEFAULT_LENGTH,
                                FlowerColor.BLUE, FlowerType.TULIP);
        FlowerInfo flowerInfoB = new Flower(DEFAULT_PRICE, DEFAULT_LENGTH,
                                FlowerColor.RED, FlowerType.ROSE);
        FlowerInfo flowerInfoC = new Flower(DEFAULT_PRICE, DEFAULT_LENGTH,
                                FlowerColor.RED, FlowerType.TULIP);
    
        FlowerPack flowerPackA = new FlowerPack(flowerA, DEFAULT_COUNT);
        FlowerPack flowerPackB = new FlowerPack(flowerB, DEFAULT_COUNT);

        FlowerBucket flowerBucketA = new FlowerBucket();
        flowerBucketA.add(flowerPackA);
        flowerBucketA.add(flowerPackB);

        FlowerBucket flowerBucketB = new FlowerBucket();
        flowerBucketB.add(flowerPackA);

        flowerStore = new FlowerStore();
        flowerStore.addBucket(flowerBucketA);
        flowerStore.addBucket(flowerBucketB);

        List<FlowerInfo> matchingList = List.of(flowerInfoA);
        List<FlowerInfo> notMatchingList = List.of(flowerInfoA,
                                            flowerInfoB, flowerInfoC);

        List<FlowerBucket> expectedMatching = List.of(flowerBucketA);
        List<FlowerBucket> expectedNotMatching = List.of();

        Assertions.assertEquals(expectedMatching,
                                flowerStore.search(matchingList));
        Assertions.assertEquals(expectedNotMatching,
                                flowerStore.search(notMatchingList));
    }
}

