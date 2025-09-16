/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.fakestoreapi.FakeStoreAPI.Service;

import com.fakestoreapi.FakeStoreAPI.DTO.CategoryDTO;
import com.fakestoreapi.FakeStoreAPI.entity.Category;
import com.fakestoreapi.FakeStoreAPI.mapper.CategoryMapper;
import com.fakestoreapi.FakeStoreAPI.mapper.GetAllCategoryMapper;
import com.fakestoreapi.FakeStoreAPI.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service("dbServices")
public class CategoryServiceRepoImpl implements CategoryService {

    private final CategoryRepository repo;

    @Autowired
    public CategoryServiceRepoImpl(CategoryRepository categoryRepository){
        this.repo = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
      List<CategoryDTO> allCategory =  new ArrayList<>();
      for(Category category: repo.findAll()){
          allCategory.add(CategoryMapper.toDTO(category));
      }
      return allCategory;
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO){
       Category saved = this.repo.save(CategoryMapper.toCatogory(categoryDTO));
       return CategoryMapper.toDTO(saved);
    }

}
