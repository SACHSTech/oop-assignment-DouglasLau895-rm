package ShoppingApp;

import ShoppingApp.*;

/**
* Super class
* @author: Douglas Lau
*/

public class Products {

  // Instance Variables
  private double initialPrice; // when quantity = 1
  private int quantity;
  private double finalPrice;

  /**
  * Constructor - Creates a Products Instance
  * @param price: the price of the product (double)
  */
  public Products(double thePrice, int theQuantity) {
    this.initialPrice = thePrice;
    this.quantity = theQuantity;
    this.finalPrice = this.initialPrice * this.quantity;
  }

  /**
  * Getter method for initial price of product (quantity = 1)
  * @return price of product
  */
  public double getInitialPrice(){
    return this.initialPrice;
  }

  /**
  * Getter method for quantity of product
  * @return quantity of product
  */
  public double getQuantity(){
    return this.quantity;
  }

  /**
  * Getter method for final price of product
  * @return final price of product
  */
  public double getFinalPrice(){
    return this.finalPrice;
  }
}