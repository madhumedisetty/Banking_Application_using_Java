package Banking;
import java.util.Scanner;

public class Banking {
    private static String[] customerNames = {"BhanuPrakash", "Akshaya", "Madhuri"};
    private static double[] customerBalances = {10000, 20000, 30000};
    private static String[] passwords = {"pass1", "pass2", "pass3"};
    private static int[] customerIds = {2010, 1010, 3010};

    public static boolean isIdValid(int customerId) {
        for (int id : customerIds) {
            if (id == customerId) {
                return true;
            }
        }
        return false;
    }

    public static int getCustomerIndex(int customerId) {
        for (int i = 0; i < customerIds.length; i++) {
            if (customerIds[i] == customerId) {
                return i; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to XYZ Banking System\n");
        System.out.print("Enter your customer ID: ");
        int customerId = sc.nextInt();

        if (!isIdValid(customerId)) {
            System.out.println("Invalid customer ID\n");
            sc.close(); 
            return;
        }

        int customerIndex = getCustomerIndex(customerId);
        System.out.print(customerNames[customerIndex] + ", please enter your password: ");
        String password = sc.next();

        if (!password.equals(passwords[customerIndex])) {
            System.out.println("Invalid password\n");
            sc.close(); 
            return;
        }

        System.out.println("\n\nLogin successful......WELCOME " + customerNames[customerIndex] + "!");

        while (true) {
            System.out.println("\nChoose an option: \n1. Check Balance\n2. Withdraw Money\n3. Deposit Money\n4. Exit\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nYour balance is: " + customerBalances[customerIndex]);
                    break;
                case 2:
                    System.out.print("\n Enter the amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= customerBalances[customerIndex]) {
                        customerBalances[customerIndex] -= withdrawAmount;
                        System.out.println("\n Withdrawal successful. Your remaining balance is: " + customerBalances[customerIndex]);
                    } else {
                        System.out.println("\n Insufficient balance");
                    }
                    break;
                case 3:
                    System.out.print("\nEnter the amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    customerBalances[customerIndex] += depositAmount;
                    System.out.println("\n Deposit successful. Your new balance is: " + customerBalances[customerIndex]);
                    break;
                case 4:
                    System.out.println("\n Thank you for using XYZ Banking System. Goodbye!");
                    sc.close(); // Close scanner before exiting
                    return;
                default:
                    System.out.println("\n Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
