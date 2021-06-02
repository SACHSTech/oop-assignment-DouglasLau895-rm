package ShoppingApp;

import ShoppingApp.*;

/**
* The ice cream products are created here
* This is a sub class of Products
* author: @Douglas Lau
*/

public class IceCream extends Products {
  // Instance Variables
  private int iceCreamAmount;
  private String iceCreamFlavour;

  /**
  * Constructor - creates a new Ice Cream Instance
  * @param iceCreamAmount: the amount of Ice Cream in dozens
  * @param iceCreamFlavour: the flavour of ice cream
  * @param iceCreamFlavourIniitalPrice: price of ice cream when quantity = 1
  * @author: Douglas Lau
  */
  public IceCream(String theIceCreamFlavour, int theIceCreamAmount, double theIceCreamInitialPrice) {
    super(theIceCreamInitialPrice, theIceCreamAmount);
    this.iceCreamAmount = theIceCreamAmount;
    this.iceCreamFlavour = theIceCreamFlavour;
  }

  /**
  * Getter method for the amount of ice cream
  * @return amount of ice cream
  */
  public int getIceCreamAmount(){
    return this.iceCreamAmount;
  }

  /**
  * Getter method for the ice cream flavour
  * @return ice cream flavour
  */
  public String getIceCreamFlavour(){
    return this.iceCreamFlavour;
  }

  /**
  * String representation of ice cream
  * @return all atttributes of ice cream
  */
  public String toString() {
    System.out.println("Successfully Added " + getIceCreamFlavour() + " x " + getIceCreamAmount() + " grams to Shopping Cart" );
    return "";
  }
}