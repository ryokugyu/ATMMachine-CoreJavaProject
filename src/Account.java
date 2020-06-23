import java.util.Scanner;

public class Account {
    static Scanner sc = new Scanner(System.in);

    static void printStatement() {
        System.out.println("Checking Account:");
        System.out.println("Type 1: View Balance");
        System.out.println("Type 2: Withdraw Funds");
        System.out.println("Type 3: Deposit Funds");
        System.out.println("Type 4: Exit");
    }

    public static void checkingAccount() {
        printStatement();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Enter a valid choice".);
                checkingAccount();
        }
    }

    public static void savingsAccount() {
        printStatement();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Enter a valid choice".);
                savingsAccount();
        }
    }
}
