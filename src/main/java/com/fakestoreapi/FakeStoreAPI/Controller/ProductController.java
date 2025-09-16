package com.fakestoreapi.FakeStoreAPI.Controller;

import com.fakestoreapi.FakeStoreAPI.DTO.ProductDTO;
import com.fakestoreapi.FakeStoreAPI.DTO.ProductWithCategoryDTO;
import com.fakestoreapi.FakeStoreAPI.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import retrofit2.http.Path;

import java.io.IOException;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(@Qualifier("dbProductService") ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) throws IOException {
        ProductDTO result = this.productService.getProductById(id);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/create")
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) throws  Exception {
       ProductDTO productDTO1 = this.productService.createProduct(productDTO);
        return ResponseEntity.ok(productDTO1);
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<ProductWithCategoryDTO> getProductWithCategory(@PathVariable long id) throws Exception {
        ProductWithCategoryDTO productWithCategoryDTO = this.productService.getProductWithCategory(id);
     return ResponseEntity.ok(productWithCategoryDTO);
    }
}
