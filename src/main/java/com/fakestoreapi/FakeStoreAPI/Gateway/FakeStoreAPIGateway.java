package com.fakestoreapi.FakeStoreAPI.Gateway;

import com.fakestoreapi.FakeStoreAPI.DTO.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface FakeStoreAPIGateway {
    List<CategoryDTO> getAllCategories() throws IOException;
}
