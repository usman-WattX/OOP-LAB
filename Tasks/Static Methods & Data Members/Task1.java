class SavingAccont{
    public static double annualInterestRate = 0;
    private double savingBalance;

    public SavingAccont(){
        savingBalance = 0.0;
    }

    public SavingAccont(double s){
        savingBalance = s;
    }


    public double calMonthlyInterest(){
        double monthlyInterest = savingBalance * (annualInterestRate / 12);
        savingBalance += monthlyInterest;
        return monthlyInterest;
    }

    public static void modifyInterest(double r){
        annualInterestRate = r/100;
    }

    public void display(){
        System.out.println("Your Balance is " + savingBalance + " including profit of " + calMonthlyInterest());
    }

}

public class Task1{
    public static void main(String[] args) {

        SavingAccont.modifyInterest(4.0);
        SavingAccont saver1 = new SavingAccont(2000.0);
        saver1.calMonthlyInterest();
        saver1.display();
        
        SavingAccont saver2 = new SavingAccont(3000.0);
        saver2.calMonthlyInterest();
        saver2.display();

    }
}