package dcit50.polymorphism;

/**
 *
 * @author Charles
 */
public class Bear extends Animal implements Carnivore, Herbivore {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.makeSound();
        bear.eat();
    }
    
    @Override
    public void eat() {
        System.out.println("I like meat and plants!");
    }
}
