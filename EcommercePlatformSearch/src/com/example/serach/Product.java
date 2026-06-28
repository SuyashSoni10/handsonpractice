package com.example.serach;

public class Product {
    private int productID;
    private String productName;
    private String category;

    //constructor for the class
    public Product(int productID, String productName, String category){
        this.productID = productID;
        this.productName = productName;
        this.category = category;
    }
    public int getProductID() {return productID;}
    public String getProductName() {return productName;}
    public String getCategory() {return category;}

    @Override
    public String toString() {
        return "Product{id=" + productID + ", name='" + productName + "'" + ", category='" + category + "'}";
    }
}
