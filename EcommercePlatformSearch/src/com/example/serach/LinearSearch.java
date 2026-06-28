package com.example.serach;

public class LinearSearch {
    public static Product searchByName(Product[] products, String targetName){
        for (int i = 0; i < products.length; i++){
            if (products[i].getProductName().equalsIgnoreCase(targetName)){
                System.out.println("Linear search : found at index " + i + " after " + (i+ 1) + " comparison(s)");
                return products[i];
            }
        }
        System.out.println("Linear search: product not found");
        return null;
    }
}
