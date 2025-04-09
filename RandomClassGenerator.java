import java.util.Random;
public class RandomClassGenerator{
	public static void main(String[] args){
		Random random =  new Random() ;
		
		boolean option = random.nextBoolean();
		System.out.printf("Do you love java? %b%n", option);
		
		int integerWithNoBound = random.nextInt();
		System.out.printf("The random number is %d%n ", integerWithNoBound);
		
		int integerWithBound = random.nextInt(2000) ;
		System.out.printf("The random number is %d%n", integerWithBound);
		
		long randomInLong = random.nextLong();
		System.out.printf("The Long number %d%n", randomInLong);
		
		float randomInFloat = random.nextFloat();
		System.out.printf("The float is %f%n", randomInFloat);
		
		double randomDouble = random.nextDouble();
		System.out.printf("The double %f%n", randomDouble);
	}
}