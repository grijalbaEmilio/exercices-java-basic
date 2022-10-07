package com.example;

public class Three {

    public static void main(String[] args) throws Exception {
        String[] names = { "Luis", "Juana", "Pepe", "George" };

        String unionNames = "";

        for (String name : names) {
            unionNames += name + " ";
        }

        System.out.println("union of names is: " + unionNames);
    }

}
