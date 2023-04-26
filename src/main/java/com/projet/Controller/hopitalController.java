package com.projet.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hopitalController {
	
	@GetMapping("/hopital")
    public String hopital() {
        return "hopital"; 
    }


}