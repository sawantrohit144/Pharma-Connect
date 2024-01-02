package com.pharma.PharmaConnect.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pharma.PharmaConnect.Entity.Product;
import com.pharma.PharmaConnect.Service.UserService;

@Controller
public class AdminController {
    @Autowired
    private UserService userService;
    
    @GetMapping("/admin/products")
    public String product(Model model){
        List<Product> productList = userService.getAllProducts();
        model.addAttribute("products", productList);
        return "admin/products";
    }

    @GetMapping("/admin/addproduct")
    public String addproduct(Model model){
        model.addAttribute("product", new Product());
        return "admin/addproduct";
    }

    @PostMapping("/admin/addproduct")
    public String addproduct(@ModelAttribute("product") Product product){
        userService.saveProduct(product);
        return "redirect:/admin/products";
    }

    @GetMapping("/admin/product/{id}")
    public String deleteproduct(@PathVariable Long id){
        userService.deleteProduct(id);
        return "redirect:/admin/products";
    }

    @GetMapping("/admin/updateproduct/{id}")
    public String showupdateproduct(Model model, @PathVariable Long id) {
        // Retrieve existing product data by ID and add it to the model
        Product product = userService.getProductById(id);
        model.addAttribute("product", product);
        return "admin/updateproduct";
    }

    @PostMapping("/admin/updateproduct/{id}")
    public String updateproduct(@ModelAttribute Product product, @PathVariable Long id) {
        userService.updateProduct(product);
        return "redirect:/admin/products";
    }

    @GetMapping("/admin/orders")
    public String orders(){
        return "admin/orders";
    }

    @GetMapping("/user/request")
    public String request(){
        return "user/request";
    }
    @GetMapping("/user/order")
    public String orderrequest(){
        return "user/order";
    }
}
