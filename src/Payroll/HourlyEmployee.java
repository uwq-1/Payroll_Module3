package Payroll;

/*
    Garson Hutchinson           2101012660

*/


public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;
    private Employee employee;


    public HourlyEmployee() {

    }
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours, Employee employee) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
        this.employee = employee;
    }


    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public double getPaymentAmount() {
        return getWage();
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + wage +
                ", hours=" + hours +
                ", employee=" + employee +
                "} " + super.toString();
    }

}
