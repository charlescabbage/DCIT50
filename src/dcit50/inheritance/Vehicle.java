package dcit50.inheritance;

/**
 *
 * @author Charles
 */
public class Vehicle {
    protected String brand;
    
    Vehicle(String brand) {
        this.brand = brand;
    }
    
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}
