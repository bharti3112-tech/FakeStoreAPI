package com.fakestoreapi.FakeStoreAPI.Gateway;

import com.fakestoreapi.FakeStoreAPI.DTO.CategoryDTO;
import com.fakestoreapi.FakeStoreAPI.DTO.CategoryResponseDTO;
import com.fakestoreapi.FakeStoreAPI.mapper.GetAllCategoryMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreGatewayImpl implements FakeStoreAPIGateway {

    private final FakeStoreApi fakeStoreCategoryApi;
    public  FakeStoreGatewayImpl(FakeStoreApi fakeStoreCategoryApi){
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        CategoryResponseDTO categoryResponseDTO =
                this.fakeStoreCategoryApi.getAllProducts().execute().body();
        if (categoryResponseDTO == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }

        return GetAllCategoryMapper.toCategoryDto(categoryResponseDTO);

    }
}
