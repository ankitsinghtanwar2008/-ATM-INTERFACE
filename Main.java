import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balance = 1000.0;  
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                
                System.out.printf("Your current balance is: ₹%.2f\n", balance);

            } else if (choice == 2) {
                
                System.out.print("Enter amount to deposit: ₹");
                double depositAmount = sc.nextDouble();
                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.printf("₹%.2f deposited successfully.\n", depositAmount);
                    System.out.printf("Updated balance: ₹%.2f\n", balance);  
                } else {
                    System.out.println("Invalid deposit amount.");
                }

            } else if (choice == 3) {
                
                System.out.print("Enter amount to withdraw: ₹");
                double withdrawAmount = sc.nextDouble();
                if (withdrawAmount > 0 && withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    System.out.printf("₹%.2f withdrawn successfully.\n", withdrawAmount);
                    System.out.printf("Updated balance: ₹%.2f\n", balance);  
                } else {
                    System.out.println("Invalid or insufficient balance.");
                }

            } else if (choice == 4) {
                System.out.println("Thank you for using the Ankit ATM. Bye!");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
