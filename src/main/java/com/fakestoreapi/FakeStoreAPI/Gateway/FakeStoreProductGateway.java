package com.fakestoreapi.FakeStoreAPI.Gateway;

import com.fakestoreapi.FakeStoreAPI.DTO.CategoryDTO;
import com.fakestoreapi.FakeStoreAPI.DTO.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface FakeStoreProductGateway {
    ProductDTO getAllProductByID(Long id) throws IOException;
}
