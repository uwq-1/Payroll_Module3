package Payroll;

/*
    Garson Hutchinson           2101012660


*/


public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;
    private CommissionEmployee commissionEmployee;


    public  BasePlusCommissionEmployee(){}

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary, CommissionEmployee commissionEmployee) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
        this.commissionEmployee = commissionEmployee;
    }
    public double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public CommissionEmployee getCommissionEmployee() {
        return commissionEmployee;
    }

    public void setCommissionEmployee(CommissionEmployee commissionEmployee) {
        this.commissionEmployee = commissionEmployee;
    }

    @Override
    public double getPaymentAmount(){
        return getBaseSalary();
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                ", commissionEmployee=" + commissionEmployee +
                /*", employee=" + employee +*/
                "} " + super.toString();
    }

    public void Display() {
        System.out.println("\nDisplay Invoice  INFO>>>");
        System.out.println("Base Salary : " + getBaseSalary());
        System.out.println("Commission Employee : " + getCommissionEmployee());
        //System.out.println("Employee : " + getEmployee());
    }




}
