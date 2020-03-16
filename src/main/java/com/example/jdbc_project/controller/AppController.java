package com.example.jdbc_project.controller;


import com.example.jdbc_project.model.Sale;
import com.example.jdbc_project.repository.SalesRepository;
import com.example.jdbc_project.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private SaleService saleService;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Sale> saleList = saleService.getAll();
        model.addAttribute("salesList",saleList);
        return "index";
    }

    @RequestMapping("/new")
    public String showNewForm(Model model){
        Sale sale = new Sale();
        model.addAttribute("sale",sale);
        return "new_form";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("sale") Sale sale){

         saleService.save(sale);
         return "redirect:/";

    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable(name = "id") int id){
        ModelAndView modelAndView = new ModelAndView("edit_form");

        Sale sale = saleService.get(id);
        modelAndView.addObject("sale", sale);

        return modelAndView;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute("sale") Sale sale){

        saleService.save(sale);
        return "redirect:/";

    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") int id){

        saleService.delete(id);

        return "redirect:/";
    }
}
