package dcit50.abstract_interface;

/**
 *
 * @author Charles
 */
public class Person1 implements IStudent {
    
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.learn();
    }
    
    @Override
    public void learn() {
        System.out.println("Learning...");
    }
}
