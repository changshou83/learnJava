package exer.PayrollSystemAbstruct;

public class SalariedEmployee extends Employee {
    private double monthlySalary;//月工资

    public SalariedEmployee(String name, int number, EntryDate birthday) {
        super(name, number, birthday);
    }

    public SalariedEmployee(String name, int number, EntryDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public String toString() {
        return "SalariedEmployee[" + super.toString() + "]";
    }
}
