package com.controller;

import com.domain.Taxcalculator;
import com.repository.TaxcalculatorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.sql.SQLException;

@Controller
@RequestMapping("/taxcalculator")
public class TaxcalculatorController {

    private TaxcalculatorRepository taxcalculatorRepository;

    public TaxcalculatorController(TaxcalculatorRepository taxcalculatorRepository) {
        this.taxcalculatorRepository = taxcalculatorRepository;
    }

    @RequestMapping("/list")
    public String list(Model model) throws SQLException {
        model.addAttribute("taxcalculators", taxcalculatorRepository.list());
        return "taxcalculator/list";
    }

    @RequestMapping("/create")
    public String create(Model model) {
        model.addAttribute("taxcalculator", new Taxcalculator());
        return "taxcalculator/create";
    }

    @RequestMapping("/store")
    public String store(@Valid @ModelAttribute("taxcalculator") Taxcalculator taxcalculator, BindingResult bindingResult) throws SQLException {
        if (bindingResult.hasErrors()) {
            return "taxcalculator/create";
        }
        taxcalculatorRepository.create(taxcalculator);
        return "redirect:/taxcalculator/list";
    }

}