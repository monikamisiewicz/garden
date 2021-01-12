package pl.monikamisiewicz.garden;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.monikamisiewicz.garden.model.Plant;
import pl.monikamisiewicz.garden.service.PlantService;

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
