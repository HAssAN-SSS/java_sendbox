import java.util.Scanner;

/**
 * SScanner
 */
public class SScanner {

  public static void main(String[] args) {
    
    Scanner sscaner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num1 = sscaner.nextInt();
    System.out.print("Enter a number: ");
    int num2 = sscaner.nextInt();
    System.out.println("The sum is " + (num1 + num2));
  }
}
