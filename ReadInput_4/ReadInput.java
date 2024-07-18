import java.io.IOException;

public class ReadInput {
  public static void main (String[] arg) throws IOException {
    System.out.println("Enter your rst byte");
    int inByte = System.in.read();
    System.out.println("The rst that you typed: " + (char) inByte);
    System.out.printf("%s: %x end of line %n", "The rst byte that you typed", inByte);
  }
}
