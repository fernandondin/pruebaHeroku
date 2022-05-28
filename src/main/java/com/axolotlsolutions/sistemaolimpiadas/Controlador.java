package com.axolotlsolutions.sistemaolimpiadas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/")
public class Controlador {
    @GetMapping("/")
    public String inicio() {
        return "index";
    }
}
