import java.util.Scanner;

public class NestedIfElse{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = input.nextLine();
		
		System.out.print("Enter mark: ");
		int mark = input.nextInt();
		
		if(mark > 100){
			System.out.printf("Mark cannot be more than 100 %n");
		}
		else{
		
		if(mark >= 80){
			System.out.printf("Candiate name: %s%n", name);
			System.out.printf("Candiate mark: %d%n", mark);
			System.out.printf("Candiate Grade: %c%n",'A');
		}
		
		else if(mark >= 70){
			System.out.printf("Candiate name: %s%n", name);
			System.out.printf("Candiate mark: %d%n", mark);
			System.out.printf("Candiate Grade: %c%n",'B');
		}
		
		 else if(mark >= 60){
			System.out.printf("Candiate name: %s%n", name);
			System.out.printf("Candiate mark: %d%n", mark);
			System.out.printf("Candiate Grade: %c%n",'C');
		}
		 else if(mark >= 50){
			System.out.printf("Candiate name: %s%n", name);
			System.out.printf("Candiate mark: %d%n", mark);
			System.out.printf("Candiate Grade: %c%n",'D');
		}
		 else if(mark >= 40){
			System.out.printf("Candiate name: %s%n", name);
			System.out.printf("Candiate mark: %d%n", mark);
			System.out.printf("Candiate Grade: %c%n",'E');
		}
		 else{
			System.out.printf("Candiate name: %s%n", name);
			System.out.printf("Candiate mark: %d%n", mark);
			System.out.printf("Candiate Grade: %c%n",'F');
		}
		}
	}
}