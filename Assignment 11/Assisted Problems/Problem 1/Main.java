

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        // Animal a =new Animal(null, 0);
        Dog d = new Dog("Muffy", 5);
        d.sounds();
        d.makeSound();
        Cat c= new Cat("Billu", 4);
        c.makeSound();
        Bird b= new Bird("Tweety",3);
        b.makeSound();
    }
}
