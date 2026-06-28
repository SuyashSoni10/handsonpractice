package com.example.serach;

public class BinarySearch {
    public static Product searchByID(Product[] sortedProducts, int targetId){
        int low = 0;
        int high = sortedProducts.length - 1;
        int steps = 0;

        while(low <= high){
            steps++;
            int mid = low + (high-low) / 2;
            int midId = sortedProducts[mid].getProductID();
            if (midId == targetId){
                System.out.println("Binary search: found at index " + mid + " in " + steps + " step(s)");
                return sortedProducts[mid];
            }else if (midId < targetId){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        System.out.println("Binary search : product not found in " + steps + " steps(s)");
        return null;
    }
}
