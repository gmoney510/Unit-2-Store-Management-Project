public class Product {

  // instance variables
  private String name;
  private double price;
  private int quantity;

  /*
   * No-argument constructor
   * Sets default values for all instance variables
   */
  public Product() {
    this("Unknown", 0.0, 0);
  }

  /*
   * Parameterized constructor
   */
  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  // Accessor methods
  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  // Mutator methods
  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /*
   * Returns a string describing this product
   */
  public String toString() {
    return "Name: " + name + "\nPrice: $" + price + "\nQuantity: " + quantity;
  }
}