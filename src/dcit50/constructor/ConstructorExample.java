package dcit50.constructor;

import java.awt.Point;

/**
 *
 * @author Charles
 */
public class ConstructorExample {
    
    public static void main(String[] args) {
        /**
         * Constructor overloading - Different ways of initializing objects
         */
        Rectangle rectA = new Rectangle(new Point(10, 20));
        // x = 10, y = 20
        
        Rectangle rectB = new Rectangle(10, 20);
        // x = 10, y = 20
        
        Rectangle rectC = new Rectangle(new Point(10, 20), 40, 30);
        // x = 10, y = 20, width = 40, length = 30
        
        Rectangle rectD = new Rectangle(10, 20, 40, 30);
        // x = 10, y = 20, width = 40, length = 30
        
        System.out.println(rectA);
        System.out.println(rectB);
        System.out.println(rectC);
        System.out.println(rectD);
    }
}
