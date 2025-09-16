package com.fakestoreapi.FakeStoreAPI.Service;

import com.fakestoreapi.FakeStoreAPI.DTO.ProductDTO;
import com.fakestoreapi.FakeStoreAPI.DTO.ProductWithCategoryDTO;

import java.io.IOException;

public interface ProductService {
    ProductDTO getProductById(Long id) throws IOException;
    ProductDTO createProduct(ProductDTO productDTO);
    ProductWithCategoryDTO getProductWithCategory(long id) throws Exception;
}
