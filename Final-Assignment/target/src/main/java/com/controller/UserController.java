package com.controller;

import com.domain.User;
import com.service.UserService;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLException;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/list")
    public String list(Model model) throws SQLException {
        model.addAttribute("user", userService.list());
        return "admin/employee";
        //return "redirect:/users/list";

    }

    @RequestMapping("/show")
    public String show(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    }
    @RequestMapping("/showemployee")
    public String showemployee(Model model) {
        User employee = new User();
        model.addAttribute("employee", employee);
        return "addemployee";
    }
    @RequestMapping("/addemployee")
    public String addemployee(@Valid @ModelAttribute("employee") User employee,
                         BindingResult bindingResult) throws SQLException {
        if (bindingResult.hasErrors()) {
            return "addemployee";
        }
        else {
            userService.insert(employee);
            return "redirect:/users/list";
        }
    }


    @RequestMapping("/submit")
    public String submit(@Valid @ModelAttribute("user") User user,
                         BindingResult bindingResult) throws SQLException {
               if (bindingResult.hasErrors()) {
                   return "registration";
               }
               else {
                   userService.insert(user);
                   return "redirect:/taxcal/show";
               }
    }

    @RequestMapping("/get")
    public void get() {
        User user = userService.get(4L);
        System.out.println(user.getId() + " " + user.getUsername() + " " + user.getPassword()+" "+user.getGender());
    }
    @RequestMapping("/update/{id}")
    public String updatefrom(@PathVariable("id") Long id,Model model) {
        User updateemployee = this.userService.get(id);
        model.addAttribute("updateemployee", updateemployee);
        return "updateemployee";
    }

    @RequestMapping(value="/updateemployee",method = RequestMethod.POST)
    public String updateemployee(@Valid @ModelAttribute User employee,
                         BindingResult bindingResult) throws SQLException {
        if (bindingResult.hasErrors()) {
            return "updateemployee";
        }
        else {
            userService.update(employee);
            return "redirect:/users/list";
        }
    }




    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        userService.delete(id);
        return "redirect:/users/list";
    }
}
