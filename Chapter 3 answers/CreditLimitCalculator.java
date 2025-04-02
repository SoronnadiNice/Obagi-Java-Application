import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of customers: ");
        int numberOfCustomers = input.nextInt();
        
        for (int i = 0; i < numberOfCustomers; i++) {
            System.out.println("Enter details for customer " + (i + 1));
            
            System.out.print("Enter account number: ");
            int accountNumber = input.nextInt();
            
            System.out.print("Enter balance at the beginning of the month: ");
            int beginningBalance = input.nextInt();
            
            System.out.print("Enter total charges this month: ");
            int charges = input.nextInt();
            
            System.out.print("Enter total credits this month: ");
            int credits = input.nextInt();
            
            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();
            
            int newBalance = beginningBalance + charges - credits;
            System.out.printf("New balance for account %d: %d\n", accountNumber, newBalance);
            
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            } else {
                System.out.println("Credit limit not exceeded.");
            }
        }
        
        input.close();
    }
}
