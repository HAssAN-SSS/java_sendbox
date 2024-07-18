import java.io.IOException;
/**
 * UserInteraction
 */
public class UserInteraction {

  public static void main(String[] args) throws IOException {

    System.out.println("pls Enter a byte:");
    int inByte = System.in.read();
    System.out.println("the byte in character is:" + (char) inByte);
    System.out.printf("%S: %d%n", "your byte in dicimal", inByte);
    
  }
}
