import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of principle, time and rate respectively:");
		float p =input.nextFloat();
		float t =input.nextFloat();
		float r=input.nextFloat();
		float si;
		si=(p*t*r)/100;
		System.out.println("The required simple interest is "+si);

	}

}
