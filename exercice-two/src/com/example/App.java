package com.example;

public class App {

    public static double calcPriceIva(double originalPrice) {
        double ivaPercentage = 0.19;
        double ivaOfOriginalPrice = originalPrice * ivaPercentage;

        return originalPrice + ivaOfOriginalPrice;
    }

    public static void main(String[] args) throws Exception {
        double priceOne = 12000;
        double priceOnePlusIva = calcPriceIva(priceOne);

        System.out.println("original price is "+priceOne+"$");
        System.out.println("original price plus iva is "+priceOnePlusIva+"$");
    }

}
