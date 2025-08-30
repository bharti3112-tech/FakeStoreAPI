package com.fakestoreapi.FakeStoreAPI.Controller;

import com.fakestoreapi.FakeStoreAPI.DTO.ProductDTO;
import com.fakestoreapi.FakeStoreAPI.Service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    public ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) throws IOException {
        ProductDTO result = this.productService.getProductById(id);
        return ResponseEntity.ok(result);
    }
}
