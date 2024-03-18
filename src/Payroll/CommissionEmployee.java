package Payroll;

/*
    Garson Hutchinson           2101012660


*/


public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;
    protected Employee employee;


    public CommissionEmployee(){

    }

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales, double commissionRate){
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales(){
        return grossSales;
    }

    public void setGrossSales(double grossSales){
        this.grossSales = grossSales;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate){
        this.commissionRate = commissionRate;
    }

    public Employee getEmployee(){
        return employee;
    }

    public void setEmployee(Employee employee){
        this.employee = employee;
    }

    @Override
    public double getPaymentAmount() {
        return getGrossSales();
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                ", employee=" + employee +
                "} " + super.toString();
    }

}
