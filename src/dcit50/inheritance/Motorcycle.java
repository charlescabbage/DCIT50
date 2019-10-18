package dcit50.inheritance;

/**
 *
 * @author Charles
 */
public class Motorcycle extends Vehicle {
    private String model = "Mio";

    public Motorcycle(String brand) {
        super(brand);
    }
    
    public static void main(String[] args) {
        Motorcycle myMotor = new Motorcycle("Yamaha");
        
        myMotor.honk();
        
        System.out.println(myMotor.brand + " " + myMotor.model);
    }
    
    @Override
    public void honk() {
        System.out.println("Tuturu!");
    }
}
