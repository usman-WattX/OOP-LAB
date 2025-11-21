class account {
    private double balance;

    public account() {
        balance = 0.00;
    }

    public account(double b) {
        if(b >= 0 ){
            balance = b;    
        }else{
            System.out.println("Balance should not be less than zero!");
        }
    }

    public void set(double b){
            if(b >= 0 ){
            balance = b;    
        }else{
            System.out.println("Balance should not be less than zero!");
        }    
    }
    public double get(){
        return balance;    
}

    public void withdrawal(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount should be greater than zero");
        } else if (amount > balance) {
            System.out.println("Your balance is less than the amount!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal SUCCESSFUL");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit SUCCESSFUL");
        } else {
            System.out.println("Deposit amount should be greater than zero");
        }
    }

    public void currentBalance() {
        System.out.println("Your Balance is: " + balance);
    }
}

public class Task2 {
    public static void main(String[] args) {
        account acc1 = new account();
        acc1.deposit(1000.0);
        acc1.withdrawal(300.0);
        acc1.currentBalance();

        account acc2 = new account(500);
        acc2.deposit(1000.0);
        acc2.withdrawal(300.0);
        acc2.currentBalance();
        
        
    }
    
}
