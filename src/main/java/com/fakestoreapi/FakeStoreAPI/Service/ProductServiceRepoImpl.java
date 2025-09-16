/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.fakestoreapi.FakeStoreAPI.Service;

import com.fakestoreapi.FakeStoreAPI.DTO.ProductDTO;
import com.fakestoreapi.FakeStoreAPI.DTO.ProductWithCategoryDTO;
import com.fakestoreapi.FakeStoreAPI.Exceptions.ProductNotFoundException;
import com.fakestoreapi.FakeStoreAPI.entity.Category;
import com.fakestoreapi.FakeStoreAPI.entity.Product;
import com.fakestoreapi.FakeStoreAPI.mapper.ProductMapper;
import com.fakestoreapi.FakeStoreAPI.repository.CategoryRepository;
import com.fakestoreapi.FakeStoreAPI.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.NoSuchElementException;

@Service("dbProductService")
public class ProductServiceRepoImpl implements ProductService {

    private final ProductRepository repo;
    private final CategoryRepository categoryRepo;

    @Autowired
    public ProductServiceRepoImpl(ProductRepository repo,CategoryRepository categoryRepo){
        this.repo = repo;
        this.categoryRepo = categoryRepo;
    }

    @Override
    public ProductDTO getProductById(Long id) throws IOException {
        Product product = repo.findById(id).orElseThrow(() -> new NoSuchElementException("Not found"));
        return ProductMapper.toDTO(product);
    }
    @Override
    public ProductDTO createProduct(ProductDTO productDTO){
        Category category = this.categoryRepo.findById(productDTO.getCategoryId()).orElseThrow(() -> new NoSuchElementException("Category doesn't exist"));
        Product product = ProductMapper.toEntity(productDTO,category);
        Product saved =  this.repo.save(product);
        System.out.println(saved);
        return ProductMapper.toDTO(saved);
    }
    @Override
    public ProductWithCategoryDTO getProductWithCategory(long id) throws Exception{
      Product product = this.repo.findById(id).orElseThrow(() -> new ProductNotFoundException("Product doesn't exist with this id"));
      return ProductMapper.toProductCategoryDTO(product);
    }
}
