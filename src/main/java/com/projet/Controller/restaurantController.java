package com.projet.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class restaurantController {
	
	@GetMapping("/restaurant")
    public String restaurant() {
        return "restaurant"; 
    }


}