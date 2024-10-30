public class PermanentHire extends SalariedWorker {
    private double bonus; // Monthly bonus

    // Constructor with base salary and bonus
    public PermanentHire(String name, int social, double salary, double bonus) {
        super(name, social, salary);
        this.bonus = bonus;
    }

    // Copy constructor
    public PermanentHire(PermanentHire ph) {
        super(ph.getName(), ph.getSocial(), ph.getSalary());
        this.bonus = ph.bonus;
    }

    // Override calculateWeeklyPay method
    @Override
    public double calculateWeeklyPay() {
        double baseWeeklyPay = super.calculateWeeklyPay();
        double bonusPerWeek = bonus / 4.0; // Assuming 4 weeks in a month
        return baseWeeklyPay + bonusPerWeek;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", Bonus: " + bonus;
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PermanentHire that = (PermanentHire) o;
        return Double.compare(that.bonus, bonus) == 0;
    }
}
