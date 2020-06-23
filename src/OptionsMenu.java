import java.util.HashMap;
import java.util.Scanner;

public class OptionsMenu extends Account {
    private static HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
    static Scanner sc = new Scanner(System.in);

    public static boolean validateDetails(int username, int password) {
        try {
            if (data.containsKey(username)) {
                int pwd = data.get(username);
                if (pwd == password)
                    return true;
                else
                    System.out.println("Incorrect password!!!");
            } else
                System.out.println("Please enter the correct username!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public static void getOptions() {

        try {
            setUserDetails();
            System.out.println("Welcome to the ATM Project!");
            System.out.print("Enter your customer number: ");
            int username = Integer.parseInt(String.valueOf(sc.nextInt()));
            System.out.print("Enter your PIN number: ");
            int password = Integer.parseInt(String.valueOf(sc.nextInt()));
            if (validateDetails(username, password)) {
                showChoices();
            }


        } catch (Exception e) {
            System.out.println("Only number allowed.");
        }
    }

    public static void setUserDetails() {
        data.put(273368, 1972);
        data.put(110696, 1996);
    }

    public static void showChoices() {
        System.out.println("Select the account you want to access: ");
        System.out.println("TYPE 1 - Checking Account");
        System.out.println("TYPE 2 - Savings Account");
        System.out.println("Type 3 - Exit");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                checkingAccount();
                break;
            case 2:
                savingsAccount();
                break;
            case 3:
                System.out.println("Exiting the program");
                break;
            default:
                System.out.println("Please enter the correct choice.");
                showChoices();
        }
    }
}
