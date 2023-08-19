package test.app.emanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.app.emanager.model.Product;
import test.app.emanager.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ApiProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.findById(id);
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productService.save(product);
    }

}
