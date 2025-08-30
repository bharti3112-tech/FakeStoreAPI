package com.fakestoreapi.FakeStoreAPI.Service;

import com.fakestoreapi.FakeStoreAPI.DTO.ProductDTO;
import com.fakestoreapi.FakeStoreAPI.Gateway.FakeStoreProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ProductServiceImpl implements ProductService {
     public FakeStoreProductGateway fakeStoreProductGateway;
     public ProductServiceImpl(FakeStoreProductGateway fakeStoreProductGateway) {
         this.fakeStoreProductGateway = fakeStoreProductGateway;
     }

    @Override
    public ProductDTO getProductById(Long id) throws IOException {
        return this.fakeStoreProductGateway.getAllProductByID(id);
    }
}
