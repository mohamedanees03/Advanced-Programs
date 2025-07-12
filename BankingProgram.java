import java.util.Scanner;

public class BankingProgram {
    static int totalBalance = 10000;

    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);  // Use only one Scanner

        while (isRunning) {
            System.out.println("\n*******************************");
            System.out.println("WELCOME TO ANEES BANK");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT AMOUNT");
            System.out.println("3. WITHDRAW MONEY");
            System.out.println("4. EXIT");
            System.out.print("SELECT YOUR CHOICE: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance();
                    break;
                case 2:
                    depositAmount(scanner);
                    break;
                case 3:
                    withdrawAmount(scanner);
                    break;
                case 4:
                    System.out.println("THANK YOU FOR CHOOSING OUR BANK!!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();  
    }

    public static void withdrawAmount(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        int withdraw = scanner.nextInt();
        if (withdraw <= 0)
            System.out.println("Amount can't be zero or negative.");
        else if (withdraw > totalBalance)
            System.out.println("Insufficient Balance.");
        else {
            totalBalance -= withdraw;
            System.out.println(withdraw + " amount withdrawn from your account.");
        }
    }

    public static void depositAmount(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        int deposit = scanner.nextInt();
        if (deposit <= 0)
            System.out.println("Amount can't be zero or negative.");
        else {
            totalBalance += deposit;
            System.out.println(deposit + " amount deposited to your account.");
        }
    }

    public static void showBalance() {
        System.out.println("Total balance amount is: " + totalBalance);
    }
}
