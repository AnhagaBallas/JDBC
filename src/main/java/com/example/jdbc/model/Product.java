package com.example.jdbc.model;

public record Product(String productName) {
    @Override
    public String toString() {
        return "productName='" + productName + '\'' +
                '}';
    }
}
