package com.nitish.blc;

public class DiscountTest {
    public static void main(String[] args) {
        int[] testAmounts = {500, 1000, 3000, 5000, 7000};
        for (int amount : testAmounts) {
            double discounted = Discount.calculateDiscount(amount);
            System.out.println("Original: " + amount + ", Discounted: " + discounted);
        }
    }
}
