package com.example.ggpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gayathrig on 04/01/2019.
 */
@Controller
public class OwnerController {

    @RequestMapping({"/owner", "/owner/", "/owner/index.html"})
    public String listOwner() {
        return ("/owner/index");
    }
}
