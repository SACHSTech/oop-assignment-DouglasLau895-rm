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

        // Eggs Selection
        if (itemSelect == 0) {
          eggSelect = 5;
          while (eggSelect > 2) {
            System.out.println("What type of egg would you like?");
            System.out.println("0 - Chicken Egg ($5.00/dozen)");
            System.out.println("1 - Duck Egg ($6.50/dozen)");
            System.out.println("2 - Golden Goose Egg ($20.00/dozen)");
            eggSelect = Integer.parseInt(keyboard.readLine());
        
            switch (eggSelect) {
              case 0:
                eggType = "Chicken Egg";
                eggInitialPrice = 5.00;
                break;
              case 1:
                eggType = "Duck Egg";
                eggInitialPrice = 6.50;
                break;
              case 2:
                eggType = "Golden Goose Egg";
                eggInitialPrice = 20.00;
                break;
              default:
                System.out.println("Try Again!");
                break;
            }
          }

          System.out.println("How many dozens of " + eggType + " do you want?");
          eggQuantitySelect = Integer.parseInt(keyboard.readLine());

          Eggs newEgg = new Eggs(eggType, eggQuantitySelect, eggInitialPrice);

          item.add(newEgg.getEggType());
          quantity.add(newEgg.getEggAmount());
          price.add(newEgg.getFinalPrice());

          System.out.println(newEgg);
        }

        // Milk Selection
        if (itemSelect == 1) {
          milkSelect = 5;
          while (milkSelect > 3) {
            System.out.println("What type of milk would you like?");
            System.out.println("0 - Chocolate Milk ($10.00/Litre)");
            System.out.println("1 - Skim Milk ($12.00/Litre)");
            System.out.println("2 - 2% Milk ($5.00/Litre)");
            System.out.println("3 - 1% Milk ($2.00/Litre)");
            milkSelect = Integer.parseInt(keyboard.readLine());
        
            switch (milkSelect) {
              case 0:
                milkType = "Chocolate Milk";
                milkInitialPrice = 10.00;
                break;
              case 1:
                milkType = "Skim Milk";
                milkInitialPrice = 12.00;
                break;
              case 2:
                milkType = "2% Milk";
                milkInitialPrice = 5.00;
                break;
              case 3:
                milkType = "1% Milk";
              milkInitialPrice = 2.00;
                break;
              default:
                System.out.println("Try Again!");
                break;
            }
          }

          System.out.println("How many litres of " + milkType + " do you want?");
          milkQuantitySelect = Integer.parseInt(keyboard.readLine());

          Milk newMilk = new Milk(milkType, milkQuantitySelect, milkInitialPrice);

          item.add(newMilk.getMilkType());
          quantity.add(newMilk.getMilkAmount());
          price.add(newMilk.getFinalPrice());

          System.out.println(newMilk);
        }

        // Ice Cream Selection
        if (itemSelect == 2) {
          iceCreamSelect = 5;
          while (iceCreamSelect > 2) {
            System.out.println("What ice cream flavour would you like?");
            System.out.println("0 - Vanilla ($2.00/Gram)");
            System.out.println("1 - Chocolate ($2.00/Gram)");
            System.out.println("2 - Strawberry ($2.00/Gram)");
            iceCreamSelect = Integer.parseInt(keyboard.readLine());
        
            switch (iceCreamSelect) {
              case 0:
                iceCreamFlavour = "Vanilla Ice Cream";
                iceCreamInitialPrice = 2.00;
                break;
              case 1:
                iceCreamFlavour = "Chocolate Ice Cream";
                iceCreamInitialPrice = 2.00;
                break;
              case 2:
                iceCreamFlavour = "Strawberry Ice Cream";
                iceCreamInitialPrice = 2.00;
                break;
              default:
                System.out.println("Try Again!");
                break;
            }
          }

          System.out.println("How many grams of " + iceCreamFlavour + " do you want?");
          iceCreamQuantitySelect = Integer.parseInt(keyboard.readLine());

          IceCream newIceCream = new IceCream(iceCreamFlavour, iceCreamQuantitySelect, iceCreamInitialPrice);

          item.add(newIceCream.getIceCreamFlavour());
          quantity.add(newIceCream.getIceCreamAmount());
          price.add(newIceCream.getFinalPrice());

          System.out.println(newIceCream);
        }
      }
  }
}