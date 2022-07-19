package com.example.TestSpringProject.controller;

import com.example.TestSpringProject.Sales;
import com.example.TestSpringProject.repo.MessageRepo;
import com.example.TestSpringProject.repo.SalesRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private SalesRepositoryJpa salesRepositoryJpa;
    @Autowired
    private MessageRepo messageRepo;
  /*  @GetMapping("/all")
    public @ResponseBody Iterable<Sales> getAllUsers(){
        return salesRepositoryJpa.findAll();
    }*/
    @GetMapping("/hello")
    public String showSales(Model model){
        model.addAttribute("sales1",salesRepositoryJpa.findAll());
        model.addAttribute("message1",messageRepo.findAll());
        return "hello";
    }
    @PostMapping("/add")
    public String add(@RequestParam int addsum,@RequestParam String adddatain,@RequestParam String datasell,@RequestParam int identif,Map<String,Object> model){
        Sales sales = new Sales(addsum,adddatain,datasell,identif);
        salesRepositoryJpa.save(sales);
        model.put("sales1",salesRepositoryJpa.findAll());
        return "hello";
    }
}
