package com.fakestoreapi.FakeStoreAPI.DTO;

import java.util.List;

public class CategoryResponseDTO {
    private String status;

    private String message;

    private List<String> categories;
    // No-args constructor
    public CategoryResponseDTO() {
    }

    // All-args constructor
    public CategoryResponseDTO(String status, String message, List<String> categories) {
        this.status = status;
        this.message = message;
        this.categories = categories;
    }

    // Getters and Setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }
}
