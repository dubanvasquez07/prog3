package com.actividad2.sprinboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class welcomecontroller {

   @GetMapping
    public String welcome(){
        return "welcome";
    }
     @GetMapping("/prueba")
    public String prueba(){
        return "prueba";
    }
}
