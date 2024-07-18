import java.io.IOException;

/**
 * MultiIn
 */
public class MultiIn {

  public static void main(String[] args) throws IOException {
    
    System.out.println("pls enter the first number");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.println("pls enter the sucond number");
    int num2 = Integer.parseInt(System.console().readLine());
    System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
  }
}
