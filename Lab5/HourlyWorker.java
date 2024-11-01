//Glenn Cheruvathur
//CSSSKL143

/*
* HourlyWorker.java
* This worker calculates her weekly pay differently than a salaried worker does,
so we override the calculateWeeklyPay method
*/
public class HourlyWorker extends Employee {
    private double hourlyPay; // Hourly pay rate
    public static final double MINIMUM_WAGE = 10.0; // Minimum wage constant

    // Default constructor
    public HourlyWorker() {
        super();
        this.hourlyPay = MINIMUM_WAGE;
    }

    // Constructor with name and social
    public HourlyWorker(String name, int social) {
        super(name, social);
        this.hourlyPay = MINIMUM_WAGE;
    }

    // Constructor with name, social, and pay
    public HourlyWorker(String name, int social, double pay) {
        super(name, social);
        if (pay > 0.0) {
            this.hourlyPay = pay;
        } else {
            this.hourlyPay = MINIMUM_WAGE;
        }
    }

    // Getter for hourly pay
    public double getHourlyPay() {
        return hourlyPay;
    }

    //notice how we override this method to act accordingly for an hourly wage
    // Override calculateWeeklyPay method
    @Override
    public double calculateWeeklyPay() {
        return hourlyPay * 40; // Assuming a 40-hour work week
    }

    // Override toString method
    @Override
    public String toString() {
        return "HourlyWorker{name='" + getName() + "', social=" + getSocial() + ", hourlyPay=" + hourlyPay + '}';
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourlyWorker that = (HourlyWorker) o;
        return Double.compare(that.hourlyPay, hourlyPay) == 0;
    }
}