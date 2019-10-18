package dcit50.inheritance;

/**
 *
 * @author Charles
 */
public class Car extends Vehicle {
    private String model = "Mustang";
    
    Car(String brand) {
        super(brand);
    }
    
    public static void main(String[] args) {
        Car myCar = new Car("Ford");
        
        myCar.honk();
        
        System.out.println(myCar.brand + " " + myCar.model);
    }
}
