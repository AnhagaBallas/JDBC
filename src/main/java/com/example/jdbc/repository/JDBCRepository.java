package com.example.jdbc.repository;

import java.util.List;

public interface JDBCRepository {
    static String read(String scriptFileName) {
        return null;
    }
    public List<String> getProductName(String name);

}
