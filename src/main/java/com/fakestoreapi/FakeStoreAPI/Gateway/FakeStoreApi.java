package com.fakestoreapi.FakeStoreAPI.Gateway;

import com.fakestoreapi.FakeStoreAPI.DTO.CategoryResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import com.fakestoreapi.FakeStoreAPI.DTO.CategoryDTO;

import java.util.List;

public interface FakeStoreApi {
    @GET("products/category")
    Call<CategoryResponseDTO> getAllCategories();

}
