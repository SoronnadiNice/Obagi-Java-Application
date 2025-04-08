import java.util.Scanner;


public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate Perimeter of diffrent shapes");
		System.out.println("Enter 1 to calculate Perimeter of a Square");
		System.out.println("Enter 2 to calculate Perimeter of a Rectangle");
		System.out.println("Enter 3 to calculate Perimeter of a Circle");
		System.out.println();
		
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			{
				System.out.print("Enter the length of the Square: ");
				int lengthOfSquare = input.nextInt();
				
				 MethodOverLoading.shape(lengthOfSquare);
			}
			break;
			
			case 2:
			{
				System.out.print("Enter the length of the rectangle: ");
				int lengthOfRectangle = input.nextInt();
				
				System.out.print("Enter the breadth of the rectangle: ");
				int breadthOfRectangle = input.nextInt();
				
				 MethodOverLoading.shape(lengthOfRectangle, breadthOfRectangle);
			}
			break;
			
			case 3:
			{
				System.out.print("Enter the radius of the circle: ");
				double radiusOfCircle = input.nextDouble();
				
				 MethodOverLoading.shape(radiusOfCircle);
			}
			break;
			default:
			System.out.println("invalid input");
		}
		
	}
	public static void shape(int length){
		int perimeterOfSquare = 4 * length;
		
		System.out.printf("The perimeter Of Square is %d%n", perimeterOfSquare);
	}
	
	public static void shape(int length,int breadth){
		int perimeterOfRectangle = 2 * (length + breadth);
		
		System.out.printf("The perimeter Of Rectangle is %d%n", perimeterOfRectangle);
	}
	
	public static void shape(double radius){
		double perimeterOfCircle = 2 * Math.PI * radius;
		
		System.out.printf("The perimeter Of Circle is %f%n", perimeterOfCircle);
	}
}