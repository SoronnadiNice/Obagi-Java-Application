import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;
        int tripCount = 0;

        while (true) {
            System.out.print("Enter miles driven (or -1 to quit): ");
            int miles = input.nextInt();
            if (miles == -1) {
                break;
            }

            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            if (gallons == 0) {
                System.out.println("Gallons cannot be zero.");
                continue;
            }

            tripCount++;
            totalMiles += miles;
            totalGallons += gallons;

            double milesPerGallon = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", milesPerGallon);
            double overallMPG = (double) totalMiles / totalGallons;
            System.out.printf("Overall miles per gallon: %.2f%n", overallMPG);
        }

        input.close();
    }
}
