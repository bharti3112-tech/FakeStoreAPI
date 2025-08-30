package com.fakestoreapi.FakeStoreAPI.Gateway;


import com.fakestoreapi.FakeStoreAPI.DTO.CategoryResponseDTO;
import com.fakestoreapi.FakeStoreAPI.DTO.ProductDTO;
import com.fakestoreapi.FakeStoreAPI.DTO.ProductResponseDTO;
import com.fakestoreapi.FakeStoreAPI.mapper.GetAllCategoryMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreProductGatewayImpl implements FakeStoreProductGateway {
    private final FakeStoreProductAPI fakeStoreProductAPI;

    public FakeStoreProductGatewayImpl(FakeStoreProductAPI fakeStoreProductAPI){
        this.fakeStoreProductAPI = fakeStoreProductAPI;
    }
    @Override
    public ProductDTO getAllProductByID(Long id) throws IOException {
        ProductResponseDTO productResponseDTO =
                this.fakeStoreProductAPI.getProductByID(id).execute().body();
        if (productResponseDTO == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }
        ProductDTO productDTO = productResponseDTO.getProduct();
        return productDTO;

    }
}
