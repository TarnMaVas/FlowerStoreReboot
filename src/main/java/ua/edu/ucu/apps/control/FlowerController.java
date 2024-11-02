package ua.edu.ucu.apps.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flower.Flower;
import ua.edu.ucu.apps.service.FlowerService;


@RestController
@RequestMapping("/flowers")
public class FlowerController {

    @Autowired
    private FlowerService flowerService;

    @PostMapping
    public Flower addFlower(@RequestBody Flower flower) {
        System.out.println("Adding flower: " + flower.toString());
        return flowerService.addFlower(flower);
    }

    @GetMapping
    public List<Flower> getFlowers() {

        return flowerService.getFlowers();
    }
}
