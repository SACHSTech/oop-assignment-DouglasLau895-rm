package ShoppingApp;

import ShoppingApp.*;

/**
* The eggs products are created here
* This is a sub class of Products
* author: @Douglas Lau
*/

public class Eggs extends Products {
  // Instance Variables
  private int eggAmount;
  private String eggType;

  /**
  * Constructor - creates a new Egg Instance
  * @param eggAmount: the amount of eggs in dozens
  * @param eggType: the type of egg 
  * @param eggIniitalPrice: price of egg when quantity = 1
  * @author: Douglas Lau
  */
  public Eggs(String theEggType, int theEggAmount, double theEggInitialPrice) {
    super(theEggInitialPrice, theEggAmount);
    this.eggAmount = theEggAmount;
    this.eggType = theEggType;
  }

  /**
  * Getter method for the amount of eggs
  * @return amount of eggs
  */
  public int getEggAmount(){
    return this.eggAmount;
  }

  /**
  * Getter method for the type of egg
  * @return type of egg
  */
  public String getEggType(){
    return this.eggType;
  }

  /**
  * String representation of egg
  * @return all atttributes of egg
  */
  public String toString() {
    System.out.println("Successfully Added " + getEggType() + " x " + getEggAmount() + " dozens to Shopping Cart" );
    return "";
  }
}