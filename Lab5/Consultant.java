public class Consultant extends HourlyWorker {
    // Constructor with just hourly pay
    public Consultant(double hourlyPay) {
        super("Default Name", 0, hourlyPay); // Add default name and social
    }

    // Constructor with name and hourly pay
    public Consultant(String name, double hourlyPay) {
        super(name, 0, hourlyPay); // Add default social
    }

    // Copy constructor
    public Consultant(Consultant c) {
        super(c.getName(), c.getSocial(), c.getHourlyPay());
    }

    // Override calculateWeeklyPay method
    @Override
    public double calculateWeeklyPay() {
        int hoursWorked = 20; // Fixed for part-time consultant
        return hoursWorked * getHourlyPay();
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString();
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        return true;
    }
}
