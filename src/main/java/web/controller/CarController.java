package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
@RequestMapping ("/cars")
public class CarController {
    private final CarService carService;
    @Autowired
    public CarController(@Qualifier ("carService1") CarServiceImpl carServiceImpl) {
        this.carService = carServiceImpl;
    }
    @GetMapping()
    public String show(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.show(count));
        return "cars";
    }
}
