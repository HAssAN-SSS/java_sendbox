/**
 * PersonTest
 */
public class PersonTest {

  public static void main(String[] args) {
    Person hueman = new Person();

    //hueman.name = "Hassan";
    hueman.age = 28;
    hueman.height = 180;

    hueman.walk(100);
    hueman.sleep();

    System.out.println(hueman.name);
//    hueman.shower();
  }
}
