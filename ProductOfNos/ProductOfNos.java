import java.io.IOException;


public class ProductOfNos {
  public static void main (String[] arg) throws IOException {

    System.out.println("Enter your first number...");

    int fst = System.in.read();

    System.out.println("Enter your second number...");

    int sec = System.in.read();

    System.out.printf("%s of %d and %d is : %d", "The product ", fst, sec,(fst * sec));
  }
}
