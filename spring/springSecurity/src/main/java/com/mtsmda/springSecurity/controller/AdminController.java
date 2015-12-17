package com.mtsmda.springSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MTSMDA on 10.12.2015.
 */
@Controller
@RequestMapping("/admin/")
public class AdminController {

    @RequestMapping(method = RequestMethod.GET, value = {"/", "/index"})
    public String indexAdminPage(ModelMap modelMap) {
        modelMap.addAttribute("message", "This is Admin page");
        return "adminPiece/index";
    }

}