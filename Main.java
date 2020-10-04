import java.util.Scanner;
/**
 * This program will tell the users ranges of their specific grade
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates the scanner for the user input
    Scanner input = new Scanner(System.in);
    
    // Asks the user which grade they have
    System.out.println("Please enter a letter grade");

    // Gets the grade from the user
    String grade = input.nextLine();

    // determines the percentages of the grades
    switch(grade){
      case "A":
      System.out.println("This is between 80% and 100%");
      break;
      case "B":
      System.out.println("This between 70% and 79%");
      break;
      case "C":
      System.out.println("This between 60% and 69%");
      break;
      case "D":
      System.out.println("This between 50% and 59%");
      break;
      case "F":
      System.out.println("This between 0% and 49%");
      break;
    }

  }
}
