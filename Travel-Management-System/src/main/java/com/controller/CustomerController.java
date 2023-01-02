package com.controller;

import com.domain.Customer;
import com.service.CustomerService;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLException;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }


    @RequestMapping("/list")
    public String list(Model model) throws SQLException {
        model.addAttribute("customer",customerService.list());
        return "customer/customer_profile";
    }


    @RequestMapping("/registrationform")
    private String registrationform(Model model){
        Customer customer=new Customer();
        model.addAttribute("customer",customer);
        return "customer_registration_form";
    }
    @RequestMapping("/submit")
    public String submit(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) throws SQLException {
        if(bindingResult.hasErrors()){
            return "customer_registration_form";
        }
        else {
            customerService.insert(customer);
            return "redirect:/customers/list";
        }

    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable("id") Long id,Model model){
        Customer customer=this.customerService.get(id);
        model.addAttribute("customer",customer);
        return "customer/edit_customer_profile";

    }
    @RequestMapping(value="/updatedone",method = RequestMethod.POST)
    public String updatedone(@Valid @ModelAttribute Customer customer,BindingResult bindingResult) throws SQLException {
        if(bindingResult.hasErrors()){
            return "customer/edit_customer_profile";
        }
        else {
            customerService.update(customer);
            return "customer/customer_profile";
            //return "redirect:customers/list";
        }

    }

    /*
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        customerService.delete(id);
        return " ";
    }

     */





}
