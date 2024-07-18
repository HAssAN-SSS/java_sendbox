import java.util.Scanner;

/**
 * PeachCalculator
 */
public class PeachCalculator {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    
    System.out.print("Enter the number of peaches picked: ");
    int peaches = sc.nextInt();
    System.out.printf("%s %d %s %d %s.%n","We have",(peaches / 20) , "full boxes and" , (peaches %20) ,"peaches left" );
  }
}
