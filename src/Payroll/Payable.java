package Payroll;

/*
    Garson Hutchinson           2101012660

*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Payable {

    double getPaymentAmount();

    /*
    Question 2 : Include a writeToFile() method in the Payable Interface that should write the value returned by
                 the getPaymentAmount() method. This method will essentially generate a pay stub for each of
                 the Employees and Invoices for contractors. The file should be saved as paystub.txt and should
                 include the name of the employee and the date of payment in addition to the amount. (15 Marks).


    Question 3 : Include the necessary exception handling for file I/O. (10 Marks)
    */



    /*static boolean writeToFile(double payRate, String payType) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("paystub.txt", true))) {
            writer.write((payType == "Credit") ? "\n\tPay Due : $" + payRate + "\tDate : " + LocalDateTime.now()
                                                                : "\n\tPay Due : $" + payRate + "\tDate : "  + LocalDateTime.now());

        } catch (IOException e) {
            System.out.println("Error occurred writing to file");
            //e.printStackTrace();
            throw new RuntimeException(e);
        }
        return true;
    }*/

    //Payable payable = new Invoice("1201", "steel", 4, 3);
    Payable payable = new SalariedEmployee("Kite", "Doe", "777-88-55", 1500);


    //payable = new Payable("Hui", "kii", "777-777-52", 41);
    String payType = "";
    String  payRate = payable.toString();
    //double  payRate = payable.getPaymentAmount();

    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy:MM:dd - HH:mm:ss");
    String dateTimeFormat = dateTime.format(dateFormat);

    static public void writeToFile(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("paystub.txt", true))){
            writer.write((payType == " ") ? "%s \n%s: $%,.2f\n\tPay Due : " + payRate + "\tDate : " + dateTimeFormat
                    : "\n\tPay Due : " + payRate + "\tDate : "  + dateTimeFormat);
        } catch (IOException e) {
            System.out.println("Error occurred writing to file");
            throw new RuntimeException(e);
        }
    }

}
