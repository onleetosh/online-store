/****
 * Customers can view all products and search by product NAME, PRICE, and DEPARTMENT.
 * Customer can add and remove products to their cart.
 * Home screen displays a list of options : Display Product, Display Cart, Exit - store
 * Display Product option shows list of products and allow user to  Search, Add, or Return to homepage
 * Display Cart option shows items in the carts with the ability to Check out, Remove or Return
 *
 */

/*
package com.pluralsight;

import java.io.*;
import java.util.ArrayList;

import java.util.regex.Pattern;

public class Store {
    public final static String dataFileName = "products.csv";
    public static ArrayList<Product> inventory = getInventory();

    public static void main(String[] args) throws IOException {



        System.out.println("Testing file reader output: \n");
        ListAllProducts();




    }


    //method desinged to prompt user command
    public static char PromptChoices() {
        System.out.println("Welcome to TOSH, a beta online store");
        System.out.println("Please select a Screen you would like to view.");

        do {
            System.out.println("P - Display Products \n C - Display Cart \n X - Exit");
            String command = Console.PromptForString();
            if (command.equalsIgnoreCase("P")) {
                return 'A';
            }
            if(command.equalsIgnoreCase("C")) {
                return 'C';
            }
            if(command.equalsIgnoreCase("X")) {
                return 'X';
            }

        }

        while(true);


    }


    //method displayed to list products
     static void ListAllProducts(){
        System.out.println("Items in stock: ");
        for (int i = 0; i <inventory.size(); i++){
            Product p = inventory.get(i);
            System.out.printf("SKU %s|Product Name %s|Price $%.2f|Department %d",p.getItemId(), p.getItemName(), p.getItemPrice(), p.getItemDepartment());
        }

    }
    //method designed to get inventory from file
     static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        try {
            /*
            System.out.println(dataFileName);
            FileReader fr = new FileReader("products.csv");
           // BufferedReader br = new BufferedReader(fr);


            System.out.println(dataFileName);
            BufferedReader br = new BufferedReader( new FileReader("products.csv"));
            String input;
            while ( (input = br.readLine()) != null) {

                String[] token = input.split(Pattern.quote("|"));
                int itemId = Integer.parseInt(token[0]);
                String itemName = token[1];
                float itemPrice = Float.parseFloat(token[2]);
                String itemDepartment = token[3];
                Product p = new Product(itemId, itemName, itemPrice, itemDepartment);
                inventory.add(p);

            }

            br.close();
        }
        catch (Exception e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
        return inventory;
    }

    //method designed to display list of products
    public static Product[] displayProduct(Product[] products) {

        return null;


    }
    //method designed to add product to cart
    public static void addToCart(){

    }
    //method designed to remove product from cart
    public static void removeFromCart(){

    }
}
*/