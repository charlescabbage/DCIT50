package dcit50.abstract_interface;

/**
 *
 * @author Charles
 */
public class Person5 extends AInstructor implements IDean,IPresident {
    
    public static void main(String[] args) {
        Person5 p = new Person5();
        p.work();
        p.manageClass();
        p.manageCollege();
        p.manageUniversity();
    }

    @Override
    public void work() {
        System.out.println("Working for " + IEmployee.WORK_HOURS + " hours...");
    }

    @Override
    public void manageCollege() {
        System.out.println("Managing college...");
    }

    @Override
    public void manageUniversity() {
        System.out.println("Managing university...");
    }
}
