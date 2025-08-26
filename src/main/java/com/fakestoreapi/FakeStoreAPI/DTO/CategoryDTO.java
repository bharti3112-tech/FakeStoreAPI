package com.fakestoreapi.FakeStoreAPI.DTO;

import lombok.Builder;

@Builder
public class CategoryDTO {
    private String name;

    public CategoryDTO() {
    }

    public CategoryDTO(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
