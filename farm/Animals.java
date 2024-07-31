public class Animals {
    public static void main(String[] args) {
        Animal baca = new Animal();
        Animal gayo = new Animal(2 , 2 , 2 );

        System.err.println("baca legs " + baca.legs);
        System.err.println("gallo legs " + gayo.legs);

        baca.setName("latifa");
        gayo.setName("coco");

        // System.err.println("baca name " + baca.name);
        // System.err.println("gallo name " + gayo.name);

        baca.getName();
        gayo.getName();



        Cow bacara = new Cow();
        bacara.makeSound();
        bacara.move();





    }
}
