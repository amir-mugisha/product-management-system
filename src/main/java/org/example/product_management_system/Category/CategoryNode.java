package org.example.product_management_system.Category;

import org.example.product_management_system.Product.Product;

import java.util.ArrayList;
import java.util.List;

class CategoryNode {
    String categoryName;
    List<Product> products;
    CategoryNode left, right;

    public CategoryNode(String categoryName) {
        this.categoryName = categoryName;
        this.products = new ArrayList<>();
        left = right = null;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

}