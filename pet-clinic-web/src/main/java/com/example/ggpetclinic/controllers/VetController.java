package com.example.ggpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gayathrig on 04/01/2019.
 */
@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/","/vets/index.html"})
    public String listVets(){
        return ("/vets/index");
    }
}
