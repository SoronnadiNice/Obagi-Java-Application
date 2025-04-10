import java.security.SecureRandom;
import java.util.Scanner;
public class NumberGenerator{
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();

        System.out.print("Enter the upper limit (enter 0 to exit): ");
        int upperLimit = scanner.nextInt();

        if (upperLimit == 0) {
            System.out.println("Program terminated by user.");
            return; 
        }

        if (upperLimit < 0) {
            System.out.println("Please enter a number greater than 0.");
        } 
		else {
            int randomNumber = secureRandom.nextInt(upperLimit) + 1;
            System.out.println("Secure random number between 1 and " + upperLimit + ": " + randomNumber);
        }

   
    }
}

	
	
