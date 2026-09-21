package com.inventory;

import java.util.List;

public class MainProgram {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        // ==========================================
        // CREATE - Add Products
        // ==========================================

        Product laptop = new Product(
                "Dell Laptop",
                "Electronics",
                65000,
                10
        );

        Product keyboard = new Product(
                "Mechanical Keyboard",
                "Accessories",
                3500,
                25
        );

        Product chair = new Product(
                "Office Chair",
                "Furniture",
                8500,
                15
        );

        dao.addProduct(laptop);
        dao.addProduct(keyboard);
        dao.addProduct(chair);


        // ==========================================
        // READ - Display All Products
        // ==========================================

        System.out.println("\n===== ALL PRODUCTS =====");

        List<Product> products = dao.getAllProducts();

        for (Product product : products) {
            System.out.println(product);
        }


        // ==========================================
        // READ - Get Product by ID
        // ==========================================

        System.out.println("\n===== GET PRODUCT BY ID =====");

        Product product = dao.getProduct(1);

        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Product not found.");
        }


        // ==========================================
        // UPDATE - Update Product
        // ==========================================

        System.out.println("\n===== UPDATE PRODUCT =====");

        if (product != null) {

            product.setPrice(70000);
            product.setQuantity(8);

            dao.updateProduct(product);
        }


        // ==========================================
        // DELETE - Delete Product
        // ==========================================

        System.out.println("\n===== DELETE PRODUCT =====");

        dao.deleteProduct(2);


        // ==========================================
        // DISPLAY FINAL PRODUCTS
        // ==========================================

        System.out.println("\n===== FINAL PRODUCT LIST =====");

        products = dao.getAllProducts();

        for (Product p : products) {
            System.out.println(p);
        }


        // Close Hibernate
        HibernateUtil.shutdown();

        System.out.println("\nApplication finished.");
    }
}