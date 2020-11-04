package pl.monikamisiewicz.garden;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.monikamisiewicz.garden.models.Plant;
import pl.monikamisiewicz.garden.services.PlantService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final PlantService plantService;

    @RequestMapping("/")
    public String goHome() {
        return "index";
    }

    @ModelAttribute("plants")
    public List<Plant> plants() {
        return plantService.getPlants();
    }

}
