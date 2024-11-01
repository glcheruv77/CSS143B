//Glenn Cheruvathur
//CSSSKL143

import java.util.ArrayList;
/*
* Driver
* Lab
*
* A simple driver to exercise the Employee hierarchy
*/
public class EmployeeDriver {
    public static void main(String[] args) {
        Accountant emp1 = new Accountant( "Rick", 123456789);
        //this next employee makes a bit more than Rick
        Accountant emp2 = new Accountant( "Tim", 55555555,10000);
        //and lets make an hourly worker
        HourlyWorker emp3 = new HourlyWorker( "Jim", 11111111);
        //then a salaried worker
        SalariedWorker emp4 = new SalariedWorker( "Jane", 222222222, 5000);
        HourlyWorker emp5 = new HourlyWorker( "Joe", 11111111,20);
        //todo: Build some PermanentHire and Consultant objects here
        //and add them to the ArrayList below
        //and build a set of workers, all of which are employees


        //how would this change the way ArrayList is declared?
        //This will cause a ClassCastException, ColorException isn't a subclass of Employee
    
        // If you want the ArrayList to store both Employees and ColorException,
        // use ArrayList<Object> and handle casting properly
        ArrayList<Employee> myEmployees = new ArrayList<Employee>();
        myEmployees.add(emp1);
        myEmployees.add(emp2);
        myEmployees.add(emp3);
        myEmployees.add(emp4);
        myEmployees.add(emp5);
        //todo: add a sixth and seventh employee to this list that you create
    
        //this code doesn't need to change, even if you add 10 new employee classes and
        //add 102 new employees - this is an example of generic code that can be written
    
        //when inheritance hierarchies are in use
        for( int i = 0; i < myEmployees.size(); i++) {
            Employee current = myEmployees.get(i);
            System.out.println( current.getName() + " makes " + current.calculateWeeklyPay() + " per week.");
        }

        // What error do you encounter? What does this mean?
        //you get a ClassCastException. This means ColorWithAlpha isn't a subclass of Employee

        /*
         * What methods are polymorphic in the Employee Hierarchy?
         * Polymorphic methods in the Employee Hierarchy include: calculateWeeklyPay()
         * 
         * How could we build a method like getRandShape() above but for use with Employees?
         * Building a method similar to getRandShape() for Employees could look like this:
         * public Employee getRandomEmployee() { Use random logic to return an instance of a subclass of Employee
         * 
         * If we built a getRandomEmployee() method that returns various Employee subclass objects; write a few lines of code that would demonstrate late binding
         * Demonstrating late binding with a getRandomEmployee() method:
         * Employee randomEmployee = getRandomEmployee();
         * System.out.println(randomEmployee.calculateWeeklyPay());
         * 
         */
    }
}
