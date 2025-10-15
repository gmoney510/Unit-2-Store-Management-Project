public class Equipment extends Product {

  private String brand;

  /*
   * No-argument constructor
   */
  public Equipment() {
    super();
    this.brand = "Generic";
  }

  /*
   * Parameterized constructor
   */
  public Equipment(String name, double price, int quantity, String brand) {
    super(name, price, quantity);
    this.brand = brand;
  }

  // Accessor
  public String getBrand() {
    return brand;
  }

  // Mutator
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /*
   * Returns a string describing the equipment, including superclass info
   */
  public String toString() {
    return super.toString() + "\nBrand: " + brand;
  }
}
