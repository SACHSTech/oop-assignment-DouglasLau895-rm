package ShoppingApp;

import java.io.*;
import ShoppingApp.*;
import java.util.ArrayList;
import java.text.NumberFormat;

/**
* This program will allow user to select and purchase grocery
* User can choose quantity, brand, etc. 
* User can select between pick-up or delivery
* User can select payment method
* @authors: Douglas Lau
*/

public class Main {
  public static void main(String[] args) throws IOException{
    
    // Initializing Variables
    int userSelect = 0;
    int itemSelect = 0;
    String checkoutSelect = "";
    String username = "";
    String password = "";

    int eggSelect = 0;
    int eggQuantitySelect = 0;
    String eggType = "";
    double eggInitialPrice = 0.00;

    int milkSelect = 0;
    int milkQuantitySelect = 0;
    String milkType = "";
    double milkInitialPrice = 0.00;

    int iceCreamSelect = 0;
    int iceCreamQuantitySelect = 0;
    String iceCreamFlavour = "";
    double iceCreamInitialPrice = 0.00;

    double subtotal = 0.00;
    double tax = 0.00;
    double total = 0.00;

    ArrayList<String> item = new ArrayList<String>();
    ArrayList<Integer> quantity = new ArrayList<Integer>();
    ArrayList<Double> price = new ArrayList<Double>();

    // Welcome Message
    System.out.println("Welcome to Shopping App, where you can purchase a variety of premium eggs, milk, and ice cream!");
    
    // Get user input on what they want to do
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    while (true) {
      System.out.println("Please Enter Your Directory: ");
      System.out.println("0 - Exit");
      System.out.println("1 - Go Shopping");
      System.out.println("2 - View Shopping Cart");
      userSelect = Integer.parseInt(keyboard.readLine());

      // 0 - Exit
      if (userSelect == 0) {
        System.out.println("Thanks for Shopping!");
        break;
      }

      // 1 - Go Shopping
      if (userSelect == 1) {
        System.out.println("What would you like to purchase?");
        System.out.println("0 - Eggs");
        System.out.println("1 - Milk");
        System.out.println("2 - Ice Cream");
        itemSelect = Integer.parseInt(keyboard.readLine());
  }
}