import java.util.Scanner;

public class BankingInformationSystem {
    private static double balance = 1000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Banking Information System ---");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("₹" + deposit + " deposited successfully.");
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal <= balance) {
                        balance -= withdrawal;
                        System.out.println("₹" + withdrawal + " withdrawn successfully.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our banking system!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
