interface Payable {
    public double getPaymentAmount();
}

class Invoice implements Payable{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public void setPartDescription(String partDescription) {
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

    public double getPaymentAmount(){
        double payment = quantity * pricePerItem;
        return payment;
    }
}

class Employee implements Payable{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

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

    public double getPaymentAmount(){
        return 0.0;
    }
}

class SalariedEmployee extends Employee{
    private double weekSalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weekSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weekSalary = weekSalary;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    public double getPaymentAmount(){
        return weekSalary;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Payable[] payables = new Payable[3];

        payables[0] = new Invoice("56734785sfuidhwuiefh", "7845678fgsjdfg", 3, 3500.0);
        payables[1] = new Employee("DD", "Sb", "0333-567-7878");
        payables[2] = new SalariedEmployee("DD", "Sb", "0333-567-7878", 60000.0);

        for(int i = 0; i < payables.length; i++){
                System.out.println(payables[i].getPaymentAmount());
        }
    }
}
