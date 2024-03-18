package Payroll;

/*
    Garson Hutchinson           2101012660

    Parent Class
*/


public abstract class Employee implements Payable {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(){

    }

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }

    public void Display(){
        System.out.println("\nDisplay Employee INFO>>>");
        System.out.println("Firstname is : " + getFirstName());
        System.out.println("Lastname  is : " + getLastName());
        System.out.println("SocialSecurity No : " + getSocialSecurityNumber());
    }

}
