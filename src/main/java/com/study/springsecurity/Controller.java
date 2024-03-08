package com.study.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/public")
    public String publicRoute(){
        return "<h1>Rota publica</h1>";
    }

    @GetMapping("/private")
    public String privateRoute(){
        return "<h1>Rota privado</h1>";
    }

}
