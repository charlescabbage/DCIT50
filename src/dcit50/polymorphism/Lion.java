package dcit50.polymorphism;

/**
 *
 * @author Charles
 */
public class Lion extends Animal implements Carnivore {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.makeSound();
        lion.eat();
    }
    
    @Override
    public void eat() {
        System.out.println("I like meat!");
    }
}
