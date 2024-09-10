package de.neuefische.java.cgnjava244springdata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductRepo productRepo = new ProductRepo();

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepo.getProducts();
    }
}
