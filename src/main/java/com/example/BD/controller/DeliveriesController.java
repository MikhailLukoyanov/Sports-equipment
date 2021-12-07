package com.example.BD.controller;

import com.example.BD.domain.goods.NewArsenal;
import com.example.BD.domain.goods.ProductName;
import com.example.BD.domain.goods.Suppliers;
import com.example.BD.repos.goods_repo.NewArsenalRepo;
import com.example.BD.repos.goods_repo.ProductNameRepo;
import com.example.BD.repos.goods_repo.SuppliersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mikhail Lukoyanov
 */
@Controller
@RequestMapping("/delivery")
public class DeliveriesController {
    @Autowired
    private NewArsenalRepo newArsenalRepo;
    @Autowired
    private ProductNameRepo productNameRepo;
    @Autowired
    private SuppliersRepo suppliersRepo;

    @GetMapping
    public String allDeliveries(Model model) {
        Iterable<NewArsenal> deliveries = newArsenalRepo.findAll();
        model.addAttribute("deliveries", deliveries);
        return "delivery/delivery";
    }

    @GetMapping("/new")
    public String newDelivery(Model model) {
        Iterable<ProductName> products = productNameRepo.findAll();
        Iterable<Suppliers> suppliers = suppliersRepo.findAll();

        model.addAttribute("products", products);
        model.addAttribute("suppliers", suppliers);
        return "delivery/new_delivery";
    }

    @PostMapping("/new")
    public String saveDelivery(@RequestParam ProductName product,
                               @RequestParam int quantity,
                               @RequestParam int price,
                               @RequestParam Suppliers supplier,
                               Model model) {
        NewArsenal newArsenal = new NewArsenal(product, quantity, price, supplier);
        newArsenalRepo.save(newArsenal);
        return "redirect:/delivery";
    }

    @GetMapping("/{id}/edit")
    public String editDelivery(Model model, @PathVariable("id") NewArsenal delivery) {
        Iterable<ProductName> products = productNameRepo.findAll();
        Iterable<Suppliers> suppliers = suppliersRepo.findAll();

        model.addAttribute("products", products);
        model.addAttribute("suppliers", suppliers);
        model.addAttribute("delivery", delivery);
        return "delivery/delivery_edit";
    }

    @PostMapping("/{id}/edit")
    public String updateDelivery(@RequestParam ProductName product,
                                 @RequestParam int quantity,
                                 @RequestParam int price,
                                 @RequestParam Suppliers supplier,
                                 @PathVariable("id") NewArsenal delivery) {
        delivery.setProductName(product);
        delivery.setQuantity(quantity);
        delivery.setPrice(price);
        delivery.setSuppliers(supplier);
        newArsenalRepo.save(delivery);
        return "redirect:/delivery";
    }

    @PostMapping("/{id}/delete")
    public String deleteDelivery(@PathVariable("id") Long id) {
        newArsenalRepo.deleteById(id);
        return "redirect:/delivery";
    }
}
