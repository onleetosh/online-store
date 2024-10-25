package com.pluralsight;

public class Screen {

    public static void main(String[] args){

        storeHomeScreen();
    }

    static void displayAllProducts(){
        System.out.println("You made it to Display all Products ");
    }

    static void displayCartAndTotal(){
        System.out.println("You made it to Cart and Toal Products ");


    }
    //first screen. Displays products, cart and exit option
    static void storeHomeScreen(){

       do {
           try {
               System.out.println("\n------------------------------");
               System.out.println("Welcome to TOSH beta store. \n Select a option\n");
               System.out.println("1- Display Products\n" +
                       "2- Display Cart\n" +
                       "3 - Exit - closes out of the application");
               System.out.println("Command: ");
               int option = Console.PromptForInt();

               switch (option) {
                   case 1:
                       displayProductScreen();
                       break;
                   case 2:
                       displayCartScreen();
                       break;
                   case 3:
                       return;
                   default:
                       System.out.println("Invalid try again: ");
               }
           }
           catch (Exception e){
               System.out.println("Error");
           }
        }
       while (true);

    }

    //second level menu: list items
    static void displayProductScreen(){
        displayAllProducts();

        do {
            try {
                System.out.println("\n------------------------------");
                System.out.println("Items\n");
                System.out.println("1- search\n" +
                        "2- add\n" +
                        "3 - go back");
                System.out.println("Command: ");
                int option = Console.PromptForInt();

                switch (option) {
                    case 1:
                       doSearch();
                        break;
                    case 2:
                        doAddProductToCart();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Invalid try again: ");
                }
            }
            catch (Exception e){
                System.out.println("Error");
            }
        }
        while (true);

    }

    //second level menu: list items in cart and total amount
    static void displayCartScreen(){
        displayCartAndTotal();
        do {
            try {
                System.out.println("\n------------------------------");
                System.out.println("Cart\n");
                System.out.println("1- Check out\n" +
                        "2- remove\n" +
                        "3 - go back \n");
                System.out.println("Command: ");
                int option = Console.PromptForInt();

                switch (option) {
                    case 1:
                        doCheckout();
                        break;
                    case 2:
                        doRemoveProductFromCart();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Invalid try again: ");
                }
            }
            catch (Exception e){
                System.out.println("Error");
            }
        }
        while (true);

    }
    //third level menu,
    // allow user to search by department, display only search items
    static void doSearch(){


    }

    static void doAddProductToCart(){

    }

    static void doCheckout(){

    }

    static void doRemoveProductFromCart(){

    }

 }
