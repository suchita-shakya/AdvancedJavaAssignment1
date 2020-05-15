import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any two numbers to be multiplied:");
		float x = input.nextFloat();
		float y = input.nextFloat();
		System.out.println("The product of "+x+" and "+y+" is "+(x*y));

	}

}
