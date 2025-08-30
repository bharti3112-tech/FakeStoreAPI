package com.fakestoreapi.FakeStoreAPI.Service;

import com.fakestoreapi.FakeStoreAPI.DTO.ProductDTO;

import java.io.IOException;

public interface ProductService {
    ProductDTO getProductById(Long id) throws IOException;
}
