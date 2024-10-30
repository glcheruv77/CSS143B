public class Accountant extends SalariedWorker {
    public static final double ACCOUNTANT_MONTHLY = 8000;

    // Constructor with name and social
    public Accountant(String name, int social) {
        super(name, social, ACCOUNTANT_MONTHLY);
    }

    // Constructor with name, social, and pay
    public Accountant(String name, int social, double monthlyPay) {
        super(name, social, monthlyPay);
    }
}
