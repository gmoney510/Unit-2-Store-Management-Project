import java.util.Scanner;

/*
 * Tests the Soccer Store Management System
 */
public class StoreRunner {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Giuliana's Soccer Store!");

    // Example objects
    Equipment ball = new Equipment("Soccer Ball", 29.99, 10, "Adidas");
    Equipment cleats = new Equipment("Soccer Cleats", 67.99, 2, "Nike");
    Equipment shinguards = new Equipment("Soccer Shinguards", 18.99, 1, "Adidas");
    Apparel jersey = new Apparel("Team Jersey", 59.99, 5, "Medium");
    Apparel sweatshirt = new Apparel("Team Sweatshirt", 76.99, 3, "Large");
    Apparel socks = new Apparel("Soccer Socks", 6.99, 4, "Small");

   
    System.out.println(ball);
    System.out.println();
    System.out.println(jersey);
    System.out.println();
    System.out.println(cleats);
    System.out.println();
    System.out.println(sweatshirt);
    System.out.println();
    System.out.println(shinguards);
    System.out.println();
    System.out.println(socks);
  }
}