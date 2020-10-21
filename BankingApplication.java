//PrimerApp
//SimpleApp
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("XZY", "BA0001");
        obj1.showMenu();
    }
}

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cId) {
        customerName = cname;
        customerId = cId;
    }
    
    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void widthdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }
    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited:" + previousTransaction);
        }
        else if (previousTransaction < 0) {
            System.out.println("Withdrawn:" + Math.abs(previousTransaction));
        } 
        else {
            System.out.println("No transation occured");
        }
    }
    
    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome" + customerName);
        System.out.println("Your ID is" + customerId);
        System.out.println("\n");
        System.out.println("A.Check Balance");
        System.out.println("B.Deposite");
        System.out.print("C.Withdraw");
        System.out.println("D.Previous transaction");
        System.out.print("E.Exit");
        do {
            System.out.println("------------------------------------");
            System.out.println("Enter an option");
            System.out.println("------------------------------------");
            option = scanner.next().charAt(0);
            System.out.print("\n");

            switch (option) {
                case 'A':
                    System.out.println("------------------------------------");
                    System.out.println("Balance =" + balance);
                    System.out.println("------------------------------------");
                    System.out.print("\n");
                    break;

                case 'B':
                    System.out.println("------------------------------------");
                    System.out.println("Enter an amount deposit:");
                    System.out.println("------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.print("\n");
                    break;

                case 'C':
                    System.out.println("------------------------------------");
                    System.out.println("Enter an amount to withdraw:");
                    System.out.println("------------------------------------");
                    int amount2 = scanner.nextInt();
                    widthdraw(amount2);
                    System.out.print("\n");
                    break;

                case 'D':
                    System.out.println("------------------------------------");
                    getPreviousTransaction();
                    System.out.println("------------------------------------");
                    System.out.print("\n");
                    break;
                case 'E':
                    System.out.println("***************************************************");
                    break;
                default:
                    System.out.println("Invalid Option!!.Please enter again");
                    break;
            }
        }
        
        while (option != 'E');
        System.out.println("ThankYou for using our services");
    }
}
