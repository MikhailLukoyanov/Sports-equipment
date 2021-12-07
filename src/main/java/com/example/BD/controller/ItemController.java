package com.example.BD.controller;

import com.example.BD.domain.Message;
import com.example.BD.domain.goods.Products;
import com.example.BD.repos.goods_repo.ProductNameRepo;
import com.example.BD.repos.goods_repo.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mikhail Lukoyanov
 */
@Controller
@RequestMapping("/product")
public class ItemController {
    @Autowired
    private ProductsRepo productsRepo;
    @Autowired
    private ProductNameRepo productNameRepo;

    @GetMapping("/price-list")
    public String allGoods(Model model) {
        Iterable<Products> products = productsRepo.findAll();

        model.addAttribute("products", products);

        return "products/price_list";
    }
}
