package com.example.serach;

public class SearchTest {
    public static void main(String[] args){
        Product[] products = {
                new Product(105, "Laptop", "Electronics"),
                new Product(102, "T-Shirt", "Clothing"),
                new Product(108, "Headphones", "Electronics"),
                new Product(101, "Novel", "Books" ),
                new Product(110, "Shoes", "Clothing"),
                new Product(103, "Tablet", "Electronics"),
                new Product(107, "Notebook", "Stationery")
        };
        Product[] sortedProducts = {
                new Product(101, "Novel",      "Books"),
                new Product(102, "T-Shirt",    "Clothing"),
                new Product(103, "Tablet",     "Electronics"),
                new Product(105, "Laptop",     "Electronics"),
                new Product(107, "Notebook",   "Stationery"),
                new Product(108, "Headphones", "Electronics"),
                new Product(110, "Shoes",      "Clothing")
        };
        System.out.println("====== Linear Search ======");
        Product result1 = LinearSearch.searchByName(products, "Headphones");
        System.out.println("Result: " + result1);

        System.out.println("====== Binary Search ======");
        Product result2 = BinarySearch.searchByID(sortedProducts, 108);
        System.out.println("Result: " + result1);

        System.out.println("====== Worst case comparison =====");
        LinearSearch.searchByName(products, "Shoes");
        BinarySearch.searchByID(sortedProducts, 110);
    }
}

