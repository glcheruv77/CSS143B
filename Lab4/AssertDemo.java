// Glenn Cheruvathur
// CSSSKL143
/**
 * CSS 162 Assert Demo
 * Usage: This software is configured to crash your program immediately upon execution.
 * If your software doesn't crash, you don't have assertions enabled (use "-ea")
 * in your editor. Google the name of your editor and "how to enable asserts" or follow
 * the instructions specific to BlueJ or Eclipse in the lab.
 * Author: Rob Nash
 */

 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class AssertDemo {
 
     /* 
      * Work on this in a piecewise fashion by uncommenting and focusing on one
      * section at a time in isolation rather than running everything at once.
      */
     public static void main(String[] args) {
         assert(true);
         // assert(false); // Comment this out to proceed
         warmUpAsserts();
         assertWithPrimitives();
         assertWithObjects();
         homeworkRelatedAsserts();
     }
 
     /**
      * Just a few warm-up asserts here.
      * Add two new assert() statements after the TODO below
      */
     private static void warmUpAsserts() {
         assert(5 > 1);
         int a = 30;
         assert(a != 0);
         assert(null == null); // could this ever be false?
         assert(true == true); // a bad day indeed if this could be false
         // TODO: craft two more asserts and place them here. If they're false, they'll crash the program.
         assert(10 < 20);  // Example assert
         assert("hello".length() == 5);  // Example assert
     }
 
     /**
      * Using asserts in conjunction with primitive types is familiar to you;
      * just as in a loop or if, you want to form a true/false (boolean) expression
      * by employing the relational operators.
      */
     private static void assertWithPrimitives() {
         //assert below to ensure a Fraction's denominator is never 0
         Scanner keys = new Scanner(System.in);
         System.out.println("Enter an integer numerator:");
         int num = keys.nextInt();
         System.out.println("Enter an int denominator, not 0:");
         int denom = keys.nextInt();
         assert(denom != 0);
 
         //assert that all ArrayLists start empty
         ArrayList<String> emptyList = new ArrayList<String>();
         assert(emptyList.size() == 0);
 
         // TODO: build two more asserts that use primitives and relational operators here
         assert(num > 0);  // Example assert
         assert(denom > 0);  // Example assert
     }
 
     /**
      * Asserts work with both primitives and objects. Just as you
      * use "==" with primitives and ".equals()" with objects, so too
      * will you use ".equals()" in asserts that deal with object equality.
      */
     private static void assertWithObjects() {
         AssertDemo ad = new AssertDemo();
         ad.checkAddress(ad);
 
         //guess what .equals() does if you don't create one yourself? (hint ==)
         assert(ad.equals(ad));
 
         // TODO: make a few objects from any previous lab and test them with assert
         Point p1 = new Point(0, 0);
         Point p2 = new Point(0, 0);
         assert(p1.equals(p2));  // Example assert
     }
 
     /**
      * This function compares the address at "this" to the address of the object
      * handed into the function.
      */
     public void checkAddress(Object input) {
         System.out.println("Address of this: " + this);
         System.out.println("Address of input: " + input);
 
         //how many aliases for the one "new" object created in main exist in this scope?
         //1? 2? 3? Which are they?
         assert(this == input); //== does an address check for objects, which is frequently NOT what we want
     }
 
     /**
      * Asserts are a useful tool for transforming postconditions and class invariants into code.
      * Lets build a few asserts that work with your current Bill & Money assignment.
      * Change the value of paidDate and cents to trip the asserts and observe the asserted error message.
      */
     private static void homeworkRelatedAsserts() {
         Object paidDate = new Object(); // really, a Date
         assert(paidDate != null); // perhaps one rule is that paidDate shouldn't be null after calling setPaidDate()
         int cents = 0;
         assert(cents >= 0 && cents <= 99); // another class invariant is written as an assert here.
 
         // TODO: craft 2 more asserts that you could use with any assignment
         assert(paidDate instanceof Object);  // Example assert
         assert(cents == 0);  // Example assert
     }
 }
 
 // Point class example for assertWithObjects()
 class Point {
     int x, y;
 
     Point(int x, int y) {
         this.x = x;
         this.y = y;
     }
 
     @Override
     public boolean equals(Object obj) {
         if (this == obj) return true;
         if (obj == null || getClass() != obj.getClass()) return false;
         Point point = (Point) obj;
         return x == point.x && y == point.y;
     }

     /**
     * Which technique do you prefer? Why?
     * I prefer using a combination of asserts and a debugger with a GUI. Asserts help catch errors early by ensuring conditions hold true, while the GUI debugger provides a visual, interactive environment to step through code and inspect state.
     *
     * Are some debugging techniques more (or less) appropriate for longer programs?
     * Yes, for longer programs, GUI debuggers and logging are more appropriate as they can handle complex states and large codebases. Asserts and console prints are simpler and best for smaller or specific sections of code.
     *
     * What are the advantages to using a debugger with a GUI?
     * A GUI debugger allows you to set breakpoints, step through code, and inspect variables in a user-friendly way, which simplifies the debugging process.
     *
     * What can you inspect here that you couldn’t when just printing to the console?
     * In a GUI debugger, you can inspect the call stack, see the state of all variables in scope, and step through code line by line, which is difficult with just console prints.
     *
     * How can proper documentation help in finding and avoiding bugs?
     * Proper documentation clarifies the intended behavior of code and functions, making it easier to understand how the code should work and thus simplifying the process of identifying deviations and bugs.
     */
 }
 