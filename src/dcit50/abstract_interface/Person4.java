/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcit50.abstract_interface;

/**
 *
 * @author Charles
 */
public class Person4 extends AInstructor implements IDean {
    
    public static void main(String[] args) {
        Person4 p = new Person4();
        p.work();
        p.manageClass();
        p.manageCollege();
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
