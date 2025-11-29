import java.util.*;
import java.io.*;

class Account implements Serializable {
    private String accNum;
    private double balance;

    public Account() {
        this("", 0.0);
    }

    public Account(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

        public String getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public boolean withDraw(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance = balance - amount;
            return true;
        }
    }

    public void inquiryBalance() {
        System.out.println("Account Number: " + accNum);
        System.out.println("Balance: " + balance);
    }
}

public class Task4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        File f = new File("Accounts.dat");
        if (!f.exists()) {
            createInitialAccounts();
        }

        boolean cont = true;
        while (cont == true) {
            System.out.println("**ATM System**");
            System.out.println("1- Withdraw");
            System.out.println("2- Deposit");
            System.out.println("3- Transfer");
            System.out.println("4- Balance Inquiry");
            System.out.println("0- Exit");
            System.out.print("Enter Choice: ");
            int choice = in.nextInt();
            in.nextLine();

            if (choice == 1) {
                withdraw();
            } else if (choice == 2) {
                deposit();
            } else if (choice == 3) {
                transfer();
            } else if (choice == 4) {
                inquiry();
            } else if (choice == 0) {
                System.out.println("Good Bye!");
                cont = false;
            } else {
                System.out.println("Invalid Input!");
            }
        }
    }

    public static void createInitialAccounts() {
        Account[] acc = new Account[10];
        System.out.println("Creating 10 accounts!");

        for (int i = 0; i < 10; i = i + 1) {
            System.out.print("Enter Account Number: ");
            String accNum = in.nextLine();
            System.out.print("Enter initial deposit: ");
            double amount = in.nextDouble();
            in.nextLine();
            acc[i] = new Account(accNum, amount);
        }

        writeAccounts(acc);
        System.out.println("Accounts saved to file!");
    }

    public static void writeAccounts(Account[] arr) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Accounts.dat"));
            out.writeObject(arr);
            out.close();
        } catch (Exception e) {
            System.out.println("Error writing file: " + e);
        }
    }

    public static Account[] readAccounts() {
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Accounts.dat"));
            Account[] arr = (Account[]) input.readObject();
            input.close();
            return arr;
        } catch (Exception e) {
            System.out.println("Error reading file: " + e);
        }
        return null;
    }

    public static int findAccount(Account[] arr, String accNum) {
        for (int i = 0; i < arr.length; i = i + 1) {
            if (arr[i].getAccNum().equals(accNum)) {
                return i;
            }
        }
        return -1;
    }

    public static void deposit() {
        Account[] arr = readAccounts();

        System.out.print("Enter account number: ");
        String accNum = in.nextLine();

        int idx = findAccount(arr, accNum);
        if (idx == -1) {
            System.out.println("Account not found!");
            return;
        }

        System.out.print("Enter deposit amount: ");
        double amt = in.nextDouble();
        in.nextLine();

        arr[idx].deposit(amt);
        writeAccounts(arr);

        System.out.println("Deposit successful!");
    }

    public static void withdraw() {
        Account[] arr = readAccounts();

        System.out.print("Enter account number: ");
        String accNum = in.nextLine();

        int idx = findAccount(arr, accNum);
        if (idx == -1) {
            System.out.println("Account not found!");
            return;
        }

        System.out.print("Enter withdraw amount: ");
        double amt = in.nextDouble();
        in.nextLine();

        if (arr[idx].withDraw(amt) == true) {
            writeAccounts(arr);
            System.out.println("Withdraw successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public static void transfer() {
        Account[] arr = readAccounts();

        System.out.print("Enter sender account number: ");
        String senderAcc = in.nextLine();

        System.out.print("Enter receiver account number: ");
        String receiverAcc = in.nextLine();

        int senderIndex = findAccount(arr, senderAcc);
        int receiverIndex = findAccount(arr, receiverAcc);

        if (senderIndex == -1 || receiverIndex == -1) {
            System.out.println("One or both accounts not found!");
            return;
        }

        System.out.print("Enter amount to transfer: ");
        double amt = in.nextDouble();
        in.nextLine();

        if (arr[senderIndex].withDraw(amt) == false) {
            System.out.println("Sender has insufficient balance!");
            return;
        }

        arr[receiverIndex].deposit(amt);
        writeAccounts(arr);

        System.out.println("Transfer successful!");
    }

    public static void inquiry() {
        Account[] arr = readAccounts();

        System.out.print("Enter account number: ");
        String accNum = in.nextLine();

        int idx = findAccount(arr, accNum);
        if (idx == -1) {
            System.out.println("Account not found!");
            return;
        }

        arr[idx].inquiryBalance();
    }
}

// import java.util.*;
// import java.io.*;

// class Account implements Serializable{
//     private String accNum;
//     private double balance;
    
//     public Account() {
//         this("");
//     }
//     public Account(String accNum) {
//         setAccNum(accNum);
//         balance = 0.0;
//     }

//     public String getAccNum() {
//         return accNum;
//     }
//     public void setAccNum(String accNum) {
//         this.accNum = accNum;
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public void deposit(double dpt){
//         balance += dpt;
//     }

//     public boolean withDraw(double amount){
//         if (amount > balance) {
//             return false;
//         }else{
//             balance -= amount;
//             return true;
//         }
//     }

//     public void inquiryBalance() {
//         System.out.println("Account [accNum=" + accNum + ", balance=" + balance + "]");
//     }
// }

// public class Task4 {
//     static Scanner in = new Scanner(System.in);
//     public static void main(String[] args) {
//         File f = new File("Accounts.dat");
//         if (!f.exists()) {
//             createInitialAccounts();
//         }
//         boolean cont = true;

//         while (cont) {
//             System.out.println("**ATM System**");
//             System.out.println("1- Withdraw");
//             System.out.println("2- Deposit");
//             System.out.println("3- Transfer");
//             System.out.println("4- Balance Inquiry");
//             System.out.println("0- Exit");
//             System.out.print("Enter Choice: ");
//             int choice = in.nextInt();
//             in.nextLine();

//             switch (choice) {
//                 case 1:
//                     withdraw();
//                     break;
//                 case 2:
//                     deposit();
//                     break;
//                 case 3:
//                     transfer();
//                     break;
//                 case 4:
//                     inquiry();
//                     break;
//                 case 0:
//                     System.out.println("Good Bye!");
//                     cont = false;
//                     break;
//                 default:
//                     System.out.println("Invalid Inpur!");
//                     break;
//             }
//         }
//     }    
//     public static void createInitialAccounts() {
//         Account[] acc = new Account[10];

//         System.out.println("Creating 10 accounts!");
//         for (int i = 0; i < 10; i++) {
//             System.out.print("Enter Account Number: ");
//             String n = in.nextLine();
//             System.out.print("Enter initial deposit: ");
//             double amount = in.nextDouble();
//             in.nextLine();
//             acc[i] = new Account(n);
//             acc[i].deposit(amount);
//         }
//         writeAccounts(acc);
//         System.out.println("Accounts saved to file!");
//     }

//     public static void writeAccounts(Account[] arr) {
//         try {
//             ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Accounts.dat"));
//             out.writeObject(arr);
//             out.close();
//         } catch (Exception e) {
//             System.out.println("Error writing file: " + e);
//         }
//     }

//     public static Account[] readAccounts() {
//         try {
//             ObjectInputStream in = new ObjectInputStream(new FileInputStream("Accounts.dat"));
//             Account[] arr = (Account[]) in.readObject();
//             in.close();
//             return arr;
//         } catch (Exception e) {
//             System.out.println("Error reading file: " + e);
//         }
//         return null;
//     }

//         public static int findAccount(Account[] arr, String accNum) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i].getAccNum().equals(accNum))
//                 return i;
//         }
//         return -1;
//     }

//     public static void deposit() {
//         Account[] arr = readAccounts();

//         System.out.print("Enter account number: ");
//         String n = in.nextLine();

//         int idx = findAccount(arr, n);
//         if (idx == -1) {
//             System.out.println("Account not found!");
//             return;
//         }

//         System.out.print("Enter deposit amount: ");
//         double amt = in.nextDouble();
//         in.nextLine();

//         arr[idx].deposit(amt);
//         writeAccounts(arr);

//         System.out.println("Deposit successful!");
//     }

//     public static void withdraw() {
//         Account[] arr = readAccounts();

//         System.out.print("Enter account number: ");
//         String n = in.nextLine();

//         int idx = findAccount(arr, n);
//         if (idx == -1) {
//             System.out.println("Account not found!");
//             return;
//         }

//         System.out.print("Enter withdraw amount: ");
//         double amt = in.nextDouble();
//         in.nextLine();

//         if (arr[idx].withDraw(amt)) {
//             writeAccounts(arr);
//             System.out.println("Withdraw successful!");
//         } else {
//             System.out.println("Insufficient balance!");
//         }
//     }

//     public static void transfer() {
//         Account[] arr = readAccounts();

//         System.out.print("Enter sender account number: ");
//         String s = in.nextLine();

//         System.out.print("Enter receiver account number: ");
//         String r = in.nextLine();

//         int si = findAccount(arr, s);
//         int ri = findAccount(arr, r);

//         if (si == -1 || ri == -1) {
//             System.out.println("One or both accounts not found!");
//             return;
//         }

//         System.out.print("Enter amount: ");
//         double amt = in.nextDouble();
//         in.nextLine();

//         if (!arr[si].withDraw(amt)) {
//             System.out.println("Sender has insufficient balance!");
//             return;
//         }

//         arr[ri].deposit(amt);
//         writeAccounts(arr);

//         System.out.println("Transfer successful!");
//     }

//     public static void inquiry() {
//         Account[] arr = readAccounts();

//         System.out.print("Enter account number: ");
//         String n = in.nextLine();

//         int idx = findAccount(arr, n);
//         if (idx == -1) {
//             System.out.println("Account not found!");
//             return;
//         }

//         arr[idx].inquiryBalance();
//     }
// }
