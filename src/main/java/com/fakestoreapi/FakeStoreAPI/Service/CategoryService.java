package com.fakestoreapi.FakeStoreAPI.Service;

import com.fakestoreapi.FakeStoreAPI.DTO.CategoryDTO;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories() throws IOException;
}
