package it.develhope.FirstAPI05;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public CarDTO getCar() {
        return new CarDTO("45-78", "Fiat 500", 10360);
    }

    @PostMapping
    public String postCard(@Valid @RequestBody CarDTO car) {
        System.out.println(car);
        return "Created";
    }
}
