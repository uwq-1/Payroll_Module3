package Payroll;

/*
    Garson Hutchinson           2101012660

*/


public class SalariedEmployee extends Employee {

    private double weeklySalary;


    public SalariedEmployee(){

    }

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{\n" +
                "weeklySalary=$" + weeklySalary +
                "} " + super.toString();
    }


}
