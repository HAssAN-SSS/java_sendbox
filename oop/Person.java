/**
 * Person
 */
public class Person {

  int age;
  int height;
  String name;

  public Person() {
    this("amal");
  }
  public Person(String nombre){
    name = nombre;
  }

  public void walk(int speed){
  
    if (speed > 10) {
      System.out.println("Walking ...");    
    }
  }

  public void sleep(){

    System.out.println("i'm sleeping ;-)");
  }

  private void takeShower(){

    System.out.println("i'm in shower ^_^");
  }
}
