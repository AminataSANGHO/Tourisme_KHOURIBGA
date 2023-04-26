package com.projet.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class banqueController {
	
	@GetMapping("/banque")
    public String banque() {
        return "banque"; 
    }


}