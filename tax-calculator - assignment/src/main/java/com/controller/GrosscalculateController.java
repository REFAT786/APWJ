package com.controller;

import com.domain.Grosscalculate;
import com.repository.GrosscalculateRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.sql.SQLException;

@Controller
@RequestMapping("/grosscalculate")
public class GrosscalculateController {
    private final GrosscalculateRepository grosscalculateRepository;

    public GrosscalculateController(GrosscalculateRepository grosscalculateRepository){
        this.grosscalculateRepository = grosscalculateRepository;
    }

    @RequestMapping("/grosslist")
    public String grossList(Model model) throws SQLException {
        model.addAttribute("grosscalculates",grosscalculateRepository.grossList());
        return  "taxcalculator/grosslist";

    }
    @RequestMapping("grosscreate")
    public String grosscreate(Model model){
        model.addAttribute("grosscalculate",new Grosscalculate());
        return "taxcalculator/grosscalculate";

    }
    @RequestMapping("/grossstore")
    public String grossstore(@Valid @ModelAttribute("grosscalculate") Grosscalculate grosscalculate, BindingResult bindingResult) throws SQLException {
        if (bindingResult.hasErrors()) {
            return "taxcalculator/grosscalculate";
        }
        grosscalculateRepository.grosscreate(grosscalculate);

        return "redirect:/grosscalculate/grosslist";
    }






}
