package com.projet.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hotelController {
	
	@GetMapping("/hotel")
    public String hotel() {
        return "hotel"; 
    }


}