package com.fakestoreapi.FakeStoreAPI.Service;

import com.fakestoreapi.FakeStoreAPI.DTO.CategoryDTO;
import com.fakestoreapi.FakeStoreAPI.Gateway.FakeStoreAPIGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service("apiServices")
public class CategoryServiceImpl implements CategoryService{
    private final FakeStoreAPIGateway fakeStoreAPIGateway;
    public  CategoryServiceImpl(FakeStoreAPIGateway fakeStoreAPIGateway){
        this.fakeStoreAPIGateway = fakeStoreAPIGateway;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
       return  this.fakeStoreAPIGateway.getAllCategories();
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO){
        return  null;
    }
}
