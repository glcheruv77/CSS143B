// Glenn Cheruvathur
// CSSSKL143
public class CallStack {

    // Called by func1()
    void func2() {
        System.out.println("In func2 method");
    }

    // Called by main
    void func1() {
        System.out.println("In func1 method");
        this.func2();
        System.out.println("Back in func1 method");
    }

    public static void main(String args[]) {
        CallStack myCallStack = new CallStack();
        System.out.println("In the main method");
        try {
            myCallStack.func1();
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero occurred in func2.");
        }
    }
}
    