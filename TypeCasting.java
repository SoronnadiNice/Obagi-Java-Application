public class TypeCasting{
	public static void main(String[] args){
		//Widening typ casting
		double weight = 678;
		System.out.printf("Your weight is %f%n",weight);
		
		//Narrowing Type Casting ASCII Code for ? = 63
		char alpha = '?';
		
		int asciiCode =(char) alpha;
		System.out.printf("The ascii Code for ? is %d%n",asciiCode);
		
		double height = 5.8;
		
		int myHeight = (int)height;
		System.out.printf("My faculty's height is %d",myHeight);
		
	}
}