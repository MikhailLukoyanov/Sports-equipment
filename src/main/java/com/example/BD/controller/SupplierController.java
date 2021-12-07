package com.example.BD.controller;

import com.example.BD.domain.goods.Suppliers;
import com.example.BD.repos.goods_repo.SuppliersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mikhail Lukoyanov
 */
@Controller
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SuppliersRepo suppliersRepo;

    @GetMapping
    public String allSupplier(Model model) {
        Iterable<Suppliers> suppliers = suppliersRepo.findAll();
        model.addAttribute("suppliers", suppliers);
        return "supplier/supplier";
    }

    @GetMapping("/new")
    public String newSupplier() {
        return "supplier/new_supplier";
    }

    @PostMapping("/new")
    public String addSupplier(@RequestParam String name_supplier,
                              @RequestParam Long agreement_number,
                              Model model) {
        Suppliers supplier = new Suppliers(name_supplier, agreement_number);
        suppliersRepo.save(supplier);
        return "redirect:/supplier";
    }
}
