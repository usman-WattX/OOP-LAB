import java.io.*;
import java.util.*;

public class Task4 {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();
    public static void main(String[] args) {
        LoadAccounts();

        while (true) {
            System.out.println("***ATM System***");
            System.out.println("1-Create Account");
            System.out.println("2-Deposit Money");
            System.out.println("3-WithDraw Money");
            System.out.println("4-Transfer Money");
            System.out.println("5-Inquiry Account Balance");
            System.out.println("0-Exit");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    createAccounts();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withDrawMoney();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    inquiryAccBalance();
                    break;
                case 0:
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }

    public static void createAccounts(){
        try {
            System.out.println("How many accounts to create?");
            int accCrt = in.nextInt();
            in.nextLine();

            for (int i = 0; i < accCrt; i++){
                System.out.print("Enter Your Name: ");
                String name = in.nextLine();
                String accNum = i + name.toUpperCase() + "XYZ";
                System.out.print("Enter Initial Amount to deposit: ");
                double intAmnt = in.nextDouble();
                in.nextLine();
                Account acc = new Account(accNum, name, intAmnt);
                accounts.add(acc);
                System.out.println("Accounted Created!");
            }
            WriteAccounts();
            return;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void depositMoney(){
        System.out.print("Enter Account Number: ");
        String accNum = in.nextLine();
        System.out.print("Enter Amount to Deposit: ");
        double amnt = in.nextDouble();
        in.nextLine();

        for(int i = 0; i < accounts.size(); i++){
            if (accounts.get(i).getAccNum().equals(accNum)) {
                accounts.get(i).deposit(amnt);
                break;
            }
        }
        System.out.println("Deposited Successfully!");
        WriteAccounts();
        return;
    }

    public static void withDrawMoney(){
        try {
            System.out.print("Enter Account Number: ");
            String accNum = in.nextLine();
            System.out.print("Enter Amount to Withdraw: ");
            double amnt = in.nextDouble();
            in.nextLine();

            for(int i = 0; i < accounts.size(); i++){
                if (accounts.get(i).getAccNum().equals(accNum)) {
                    accounts.get(i).withDraw(amnt);
                    break;
                }
            }
            System.out.println("WithDrawl Successful!");
            return;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            WriteAccounts();
            return;
        }
    }

    public static void transferMoney(){
        System.out.print("Enter Account Number: ");
        String accNum = in.nextLine();
        System.out.print("Enter Account Number to Transfer: ");
        String othAccNum = in.nextLine();
        System.out.print("Enter Amount to Transfer: ");
        double amnt = in.nextDouble();

        for(int i = 0; i < accounts.size(); i++){
            try {
                if (accounts.get(i).getAccNum().equals(accNum)) {
                    accounts.get(i).withDraw(amnt);
                    break;
                }   
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        for(int i = 0; i < accounts.size(); i++){
            if (accounts.get(i).getAccNum().equals(othAccNum)) {
                accounts.get(i).deposit(amnt);
                break;
            }   
        }      
        System.out.println("Money Transfer Successfully from Acc No. " + accNum + " to " + othAccNum + "!");
        WriteAccounts();
        return;  
    }

    public static void inquiryAccBalance(){
        System.out.print("Enter Account Number: ");
        String accNum = in.nextLine();

        for(int i = 0; i < accounts.size(); i++){
            if (accounts.get(i).getAccNum().equals(accNum)) {
                System.out.println(accounts.get(i).inquiryBalance());
                break;
            }
        }
        return;
    }

    public static void WriteAccounts(){
        try {
            FileOutputStream file = new FileOutputStream("Accounts.dat");
            ObjectOutputStream writer = new ObjectOutputStream(file);

            for(int i = 0; i < accounts.size(); i++){
                writer.writeObject(accounts.get(i));
            }

            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void LoadAccounts(){
        try {
            FileInputStream file = new FileInputStream("Accounts.dat");
            ObjectInputStream reader = new ObjectInputStream(file);

            while (true) {
            try {
                accounts.add((Account) reader.readObject());
            } catch (EOFException e) {
                break;
            }
        }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Account implements Serializable{
    private String accNum;
    private String name;
    private double balance;

    public Account() {
        this("", "", 0.0);
    }

    public Account(String accNum, String name, double balance) {
        setAccNum(accNum);
        setName(name);
        deposit(balance);   
    }

    public String getAccNum() {
        return accNum;
    }
    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amnt){
        balance += amnt;
    }

    public void withDraw(double amnt){
        if(balance >= amnt){
            balance -= amnt;
        }else if(balance < amnt){
            throw new IllegalArgumentException("Insufficient Balance!");
        }
    } 

    public String inquiryBalance(){
        return ("Bank Account: \nName: " + name +
            "| Account Number: " + accNum + 
            "| Current Balance: " + balance
        );
    }
}
