package dcit50.abstract_interface;

/**
 *
 * @author Charles
 */
public class Person2 implements IInstructor,IDean {
    
    public static void main(String[] args) {
        Person2 p = new Person2();
        p.work();
        p.manageClass();
        p.manageCollege();
    }

    @Override
    public void manageClass() {
        System.out.println("Managing class...");
    }

    @Override
    public void work() {
        System.out.println("Working for " + IEmployee.WORK_HOURS + " hours...");
    }

    @Override
    public void manageCollege() {
        System.out.println("Managing college...");
    }
}
