public class SalariedWorker extends Employee {
    private double monthlyPay; // Monthly pay rate

    // Default constructor
    public SalariedWorker() {
        super();
    }

    // Constructor with name and social
    public SalariedWorker(String name, int social) {
        super(name, social);
    }

    // Constructor with name, social, and pay
    public SalariedWorker(String name, int social, double pay) {
        super(name, social);
        if (pay > 0.0) {
            monthlyPay = pay;
        }
    }

    // Getter for monthly pay
    public double getSalary() {
        return monthlyPay;
    }

    // Override calculateWeeklyPay method
    @Override
    public double calculateWeeklyPay() {
        return monthlyPay / 4; // Assuming 4 weeks in a month
    }

    // Override toString method
    @Override
    public String toString() {
        return "SalariedWorker{name='" + getName() + "', social=" + getSocial() + ", monthlyPay=" + monthlyPay + '}';
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SalariedWorker that = (SalariedWorker) o;
        return Double.compare(that.monthlyPay, monthlyPay) == 0;
    }
}
