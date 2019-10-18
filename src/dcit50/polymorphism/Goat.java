package dcit50.polymorphism;

/**
 *
 * @author Charles
 */
public class Goat extends Animal implements Herbivore {
    public static void main(String[] args) {
        Goat goat = new Goat();
        goat.makeSound();
        goat.eat();
    }
    
    @Override
    public void makeSound() {
        System.out.println("Mehehehe!");
    }
    
    @Override
    public void eat() {
        System.out.println("I like plants!");
    }
}
