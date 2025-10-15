public class Apparel extends Product {

  private String size; 

  /*
   * No-argument constructor
   */
  public Apparel() {
    super();
    this.size = "One Size";
  }

  /*
   * Parameterized constructor
   */
  public Apparel(String name, double price, int quantity, String size) {
    super(name, price, quantity);
    this.size = size;
  }

  // Accessor
  public String getSize() {
    return size;
  }

  // Mutator
  public void setSize(String size) {
    this.size = size;
  }

  /*
   * Returns a string describing the apparel, including superclass info
   */
  public String toString() {
    return super.toString() + "\nSize: " + size;
  }
}