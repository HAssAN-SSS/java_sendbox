import java.util.Scanner;
/**
 * StudentId
 */
public class StudentId {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    
    System.out.print("Enter Your Name: ");
    String nombre = sc.nextLine();
    System.out.print("Enter Your University: ");
    String uni = sc.nextLine();
    System.out.print("Enter Your Age: ");
    int age = sc.nextInt();

    System.out.println('/n'+ '/n' + '/n' + "Her is your ID");
    System.out.println("*************************");
    System.out.println("Name: " + nombre);
    System.out.println("University: " + uni);
    System.out.println("Age: " + age);
    System.out.println("*************************");
  }
}
