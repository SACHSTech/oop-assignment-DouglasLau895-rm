package ShoppingApp;

import ShoppingApp.*;

/**
* The milk products are created here
* This is a sub class of Products
* author: @Douglas Lau
*/

public class Milk extends Products {
  // Instance Variables
  private int milkAmount;
  private String milkType;

  /**
  * Constructor - creates a new Milk Instance
  * @param milkAmount: the amount of milk in litres
  * @param milkType: the type of milk
  * @param milkIniitalPrice: price of milk when quantity = 1
  * @author: Douglas Lau
  */
  public Milk(String theMilkType, int theMilkAmount, double theMilkInitialPrice) {
    super(theMilkInitialPrice, theMilkAmount);
    this.milkAmount = theMilkAmount;
    this.milkType = theMilkType;
  }

  /**
  * Getter method for the amount of milk in litres
  * @return amount of milk
  */
  public int getMilkAmount(){
    return this.milkAmount;
  }

  /**
  * Getter method for the type of milk
  * @return type of milk
  */
  public String getMilkType(){
    return this.milkType;
  }

  /**
  * String representation of milk
  * @return all atttributes of milk
  */
  public String toString() {
    System.out.println("Successfully Added " + getMilkType() + " x " + getMilkAmount() + " litres to Shopping Cart" );
    return "";
  }
}