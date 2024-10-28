package ua.edu.ucu.apps.control;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flower.Flower;
import ua.edu.ucu.apps.flower.FlowerColor;
import ua.edu.ucu.apps.flower.FlowerType;

@RestController
@RequestMapping("/flowers")
public class FlowerController {

    // @Autowired
    // private FlowerService flowerService;

	@GetMapping
	public List<Flower> listFlowers() {

		List<Flower> flowers = new ArrayList<>();
		flowers.add(new Flower(10, 60, FlowerColor.RED, FlowerType.TULIP));
		flowers.add(new Flower(20, 70, FlowerColor.YELLOW, FlowerType.ROSE));
		flowers.add(new Flower(30, 80, FlowerColor.WHITE, FlowerType.CHAMOMILE));
		return flowers;
	}

}
