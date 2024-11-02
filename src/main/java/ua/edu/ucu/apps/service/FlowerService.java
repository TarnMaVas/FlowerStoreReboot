package ua.edu.ucu.apps.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.edu.ucu.apps.flower.Flower;
import ua.edu.ucu.apps.repo.FlowerRepository;

@Service
public class FlowerService {
    private final FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        List<Flower> flowers = flowerRepository.findAll();
        return flowers;
    }

    public Flower addFlower(Flower flower) {
        return flowerRepository.save(flower);
    }

    public Flower getFlowerById(Long id) {
        return flowerRepository.findById(id).orElse(null);
    }
}