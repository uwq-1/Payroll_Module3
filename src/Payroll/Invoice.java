package Payroll;

/*
    Garson Hutchinson           2101012660

*/

public class Invoice implements Payable {

    private String partNumber;
    private String partDescription;
    private  int quantity;
    private double pricePerItem;


    public Invoice (){}

    public Invoice (String partNumber, String partDescription, int quantity, double pricePeritem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePeritem;
    }

    public String getPartNumber(){
        return  partNumber;
    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public String getPartDescription(){
        return  partDescription;
    }
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        Payable.writeToFile();
        return getQuantity() * getPricePerItem();
    }


    @Override
    public String toString() {
        return "Invoice : {" +
                "partNumber='" + partNumber + '\'' +
                ", partDescription='" + partDescription + '\'' +
                ", quantity=" + quantity +
                ", pricePerItem=" + pricePerItem +
                '}';
    }


    public void Display() {
        System.out.println("\nDisplay Invoice  INFO>>>");
        System.out.println("PartNumber is : " + getPartNumber());
        System.out.println("PartDescription  is : " + getPartDescription());
        System.out.println("Quantity No : " + getQuantity());
        System.out.println("PricePer  : " + getPricePerItem());
        System.out.println("Payment Amount is : " + getPaymentAmount());

    }


}
