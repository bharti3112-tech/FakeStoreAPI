package com.fakestoreapi.FakeStoreAPI.mapper;

import com.fakestoreapi.FakeStoreAPI.DTO.CategoryDTO;
import com.fakestoreapi.FakeStoreAPI.DTO.CategoryResponseDTO;

import java.util.List;

public class GetAllCategoryMapper {
    public static List<CategoryDTO> toCategoryDto(CategoryResponseDTO dto) {
        return dto.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();
    }

}
