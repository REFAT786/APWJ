package com.controller;

import com.domain.Taxcalculator;
import com.service.TaxcalService;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.sql.SQLException;

@Controller
@RequestMapping("/taxcal")
public class TaxcalController {
    private TaxcalService taxcalService;

    public TaxcalController(TaxcalService taxcalService){
        this.taxcalService=taxcalService;

    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
    @RequestMapping("/list")
    public String list(Model model) throws SQLException {
        model.addAttribute("taxcalculator", taxcalService.list());
        return "user/list";

    }

    @RequestMapping("/show")
    public String show(Model model) {
        Taxcalculator taxcalculator = new Taxcalculator();
        model.addAttribute("taxcalculator", taxcalculator);
        return "user/taxcal";
    }

    @RequestMapping("/submit")
    public String submit(@Valid @ModelAttribute("taxcalculator") Taxcalculator taxcalculator,
                         BindingResult bindingResult) throws SQLException {
        if (bindingResult.hasErrors()) {
            return "user/taxcal";
        }
        else {
            taxcalService.insert(taxcalculator);
            //return "user/list";
            return "redirect:/taxcal/list";
        }
    }

    @RequestMapping("/get")
    public void get() {
        Taxcalculator taxcalculator = taxcalService.get(4L);
        System.out.println(taxcalculator.getId() + " " + taxcalculator.getCatagory() + " " + taxcalculator.getZone()+" "+taxcalculator.getGsalary()+ " " +taxcalculator.getSalary()+ " " +taxcalculator.getRent()+ " " +taxcalculator.getMedical()+ " " +taxcalculator.getConveyance()+ " " +taxcalculator.getOthers()+ " " +taxcalculator.getSalarytaxable()+ " " +taxcalculator.getRenttaxable()+ " " +taxcalculator.getMedicaltaxable()+ " " +taxcalculator.getConveyancetaxable()+ " " +taxcalculator.getOtherstaxable()+ " " +taxcalculator.getTotaltaxable());
    }
}
