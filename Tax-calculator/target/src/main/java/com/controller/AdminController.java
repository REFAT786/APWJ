package com.controller;

import com.domain.Admin;
import com.domain.User;
import com.service.AdminService;
import com.service.UserService;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.sql.SQLException;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }



    @RequestMapping("/show")
    public String show(Model model) {
        Admin admin = new Admin();
        model.addAttribute("admin", admin);
        return "adminregistration";
    }


    @RequestMapping("/submit")
    public String submit(@Valid @ModelAttribute("admin") Admin admin,
                         BindingResult bindingResult) throws SQLException {
               if (bindingResult.hasErrors()) {
                   return "adminregistration";
               }
               else {
                   adminService.insert(admin);
                   return "redirect:/users/list";
               }
    }


    @RequestMapping("/get")
    public void get() {
        Admin admin = adminService.get(3L);
        System.out.println(admin.getId() + " " + admin.getUsername() + " " + admin.getPassword());
    }


}
