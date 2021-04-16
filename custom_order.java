// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {

      // System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBJECT, DECLARE VARIABLES, & PRINT STATEMENTS
	  
    Scanner keyboard = new Scanner(System.in);

    double cost = 15.00; // Cost of cake and cupcakes
    final double TAX_RATE = .08; // Sales tax rate
	 
    // Introduce shop and prompt user to input first name

      System.out.println("Welcome to Java's Cake & Cupcake Shop!");
      System.out.println("We make custom cakes with our secret cake batter!");

    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU

      System.out.println("What is your first name? ");
      String firstName = keyboard.nextLine();

      System.out.println("Welcome " + firstName + "! Please see our MENU below: \n");

    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

      System.out.println("""
          _______________________________________________
              MENU          QUANTITY        BASE COST
          _______________________________________________
              Cake          1               $15
          Set of Cupcakes   6               $15
          _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
          Frostings (vanilla, chocolate, strawberry, coco)
          Fillings (mocha, mint, lemon, caramel, vanilla)
          Toppings (sprinkles, cinnamon, cocoa, nuts)
          _______________________________________________
          """);

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

      System.out.println("Soooo... what'chyu ordering? CUPCAKES or a CAKE?");
      String itemOrder = keyboard.nextLine();
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

      System.out.println("What type of FROSTING do you want?");
      System.out.println("We have Vanilla, Chocolate, Strawberry, and Coco.");
      String frostingType = keyboard.nextLine();
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING

      System.out.println("FILLING time!");
      System.out.println("Mocha, Mint, Lemon, Caramel, or Raspberry?");
      String fillingType = keyboard.nextLine();

    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS

      System.out.println("Okay, time to top with a TOPPING!");
      System.out.println("This is the best part...");
      System.out.println("Sprinkles, Cinnamon, Cocoa, or Nuts?");
      String toppings = keyboard.nextLine();
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION

      System.out.println("Okay, " + firstName + ", here's your order:");
      System.out.println("_________________________________________");
      System.out.println("Item Ordered: " + itemOrder);
      System.out.println("Frosting: " + frostingType);
      System.out.println("Filling: " + fillingType);
      System.out.println("Toppings: " + toppings);
      System.out.println("_________________________________________");
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX'

      System.out.println("The cost of your order is: $" + cost);
      double tax = cost * TAX_RATE;
      System.out.println("The tax is: $" + tax);
      System.out.println("The total due is $" + (tax + cost));
  
    }   
}