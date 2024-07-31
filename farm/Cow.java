public class Cow implements AnimalBehavior, AnimalListener  {

    @Override
    public void makeSound() {
        System.out.println("MooooW");
        onMakeSound();
        
    }

    @Override
    public void move() {
        System.out.println("Troc Troc");
        onAnimalMove();
        
    }

    @Override
    public void onAnimalMove() {
        System.out.println("event: onAnimalMove");
        
    }

    @Override
    public void onMakeSound() {
        System.out.println("event: onMakeSound");
        
    }

    
    
}
