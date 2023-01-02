package com.controller;

import com.domain.Customer;
import com.domain.CustomizePackage;
import com.service.CustomerService;
import com.service.CustomizePackageService;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLException;

@Controller
@RequestMapping("/customers/customizepackage")
public class CustomizePackageController {

    private CustomizePackageService customizePackageService;

    public CustomizePackageController(CustomizePackageService customizePackageService){
        this.customizePackageService=customizePackageService;
    }
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }


    @RequestMapping("/list")
    public String list(Model model) throws SQLException {
        model.addAttribute("customizepackage",customizePackageService.list());
        return "customer/view_booking_package";
    }


    @RequestMapping("/show")
    private String customizepackageform(Model model){
        CustomizePackage customizePackage=new CustomizePackage();
        model.addAttribute("customizepackages",customizePackage);
        return "customer/customize_package";
    }
    @RequestMapping("/submit")
    public String submit(@Valid @ModelAttribute("customizepackage") CustomizePackage customizePackage, BindingResult bindingResult) throws SQLException {
        if(bindingResult.hasErrors()){
            return "customer/customize_package";
        }
        else {
            customizePackageService.insert(customizePackage);
            return "redirect:/customers/customizepackage/list";
        }

    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        customizePackageService.delete(id);
        return "redirect:/customers/customizepackage/list";
    }


}
