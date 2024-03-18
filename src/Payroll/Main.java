package Payroll;

/*
    Garson Hutchinson           2101012660

*/

public class Main {

    public static void main(String[] args){



      Payable [] payables = new Payable[4];

      payables[0] = new Invoice("100S", "seat", 2, 375.00);
      payables[1] = new Invoice("4110Z", "tire", 1, 74);
      payables[2] = new SalariedEmployee("John", "Doe", "111-11-22", 500);
      payables[3] = new SalariedEmployee("Emma", "Barnes", "555-110-23", 700);


      System.out.println("Invoices and Employee records:\n");


      for(Payable currentPayable : payables){
          System.out.printf("%s \n%s: $%,.2f\n\n", currentPayable.toString(),
                  "payment due", currentPayable.getPaymentAmount());
      }

      Invoice obj = new Invoice("1024", "teel", 5, 14.3);
      obj.Display();

      System.out.println("\n");

      CommissionEmployee commissionEmployee = new CommissionEmployee("Donald", "Brown", "444-22-101", 150, 12);
      System.out.println("Employee Format : ");
      commissionEmployee.Display();

      System.out.println("\n");
      System.out.println("Base Commission Employee Format : ");

      BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Hiik", "Burke", "111-222-55", 1500, 12, 20000, commissionEmployee);
      basePlusCommissionEmployee.Display();
    }
}
