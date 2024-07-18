import java.util.Scanner;
import java.io.IOException;
/**
 * StockChangeCalculator
 */
public class StockChangeCalculator {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws IOException {
    
    System.out.print("Enter the stock symbol: ");
    String stockName = sc.nextLine();
    System.out.print("Enter " + stockName + "'s day 1 value: ");
    float day1 = sc.nextInt();
    System.out.print("Enter " + stockName + "'s day 2 value: ");
    float day2 = sc.nextInt();
    float prc = (-(day1 - day2) / day1) * 100;
    System.out.printf("%s %.2f%s.%n",(stockName + " has changed ") , prc , "% in one day");
  }
}
