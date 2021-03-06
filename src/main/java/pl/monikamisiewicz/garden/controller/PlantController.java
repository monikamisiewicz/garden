package pl.monikamisiewicz.garden.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.monikamisiewicz.garden.model.*;
import pl.monikamisiewicz.garden.service.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class PlantController {

    private final PlantService plantService;
    private final CategoryService categoryService;
    private final ExposureService exposureService;
    private final BloomTimeService bloomTimeService;
    private final StatusService statusService;

    @GetMapping("/add-plant")
    public String addPlant(Model model) {
        model.addAttribute("plant", new Plant());
        return "add-plant";
    }

    @PostMapping("/save-plant")
    public String savePlant(@Valid Plant plant, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-plant";
        }
        plantService.save(plant);
        return "redirect:/plants";
    }

    @GetMapping("/edit-plant/{id}")
    public String editPlant(@PathVariable long id, Model model) {
        Optional<Plant> plant = plantService.findById(id);
        model.addAttribute("plant", plant);
        return "edit-plant";
    }

    @PostMapping("/edit-plant")
    public String update(@ModelAttribute("plant") @Valid Plant plant, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit-plant";
        }
        plantService.save(plant);
        return "redirect:/plants";
    }

    @GetMapping("/delete-plant-action{id}")
    public String deletePlant(@PathVariable long id, @RequestParam("action") boolean action) {
        if (action) {
            plantService.delete(id);
        }
        return "redirect:/plants";
    }

    @GetMapping("/plants")
    public String getPlants(Model model) {
        model.addAttribute("plants", plantService.getPlants());
        return "plants";
    }

    @GetMapping("/name")
    public String findByName(@RequestParam("name") String name, Model model) {
        model.addAttribute("plants", plantService.findByName(name));
        return "plants";
    }

    @ModelAttribute("categories")
    public List<Category> categories() {
        return categoryService.getCategories();
    }

    @ModelAttribute("exposures")
    public List<Exposure> exposures() {
        return exposureService.getExposures();
    }

    @ModelAttribute("bloomTimes")
    public List<BloomTime> bloomTimes() {
        return  bloomTimeService.getBloomTimes();
    }

    @ModelAttribute("statuses")
    public List<Status> statuses() {
        return statusService.getStatuses();
    }

}

