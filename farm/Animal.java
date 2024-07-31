/**
 * Animal
 */
public class Animal {

    int legs, ears , eyes ;
    String name , family ;
    
    public Animal(int earsIn, int legsIn, int eyesIn ) {

        ears = earsIn;
        legs = legsIn;
        eyes = eyesIn;

    }

    public Animal() {
        this.ears = 2;
        this.legs = 4;
        this.eyes = 2;
    }


    public void getName() {
        System.err.println("the animal name is " + this.name);
    }

    public void setName(String nombre) {
        this.name = nombre;
    }
}