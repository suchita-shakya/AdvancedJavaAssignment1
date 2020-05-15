import java.util.Scanner;
public class ExceptionQn8 {

	public ExceptionQn8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number that is to be divided and divisor: ");
		int number =input.nextInt();
		int divisor =input.nextInt();
		try {
			int output=number/divisor;
			System.out.println("The output of "+number+"/"+divisor+" is "+output);
		}
		catch(Exception ae) {
			System.out.println("Number cannot be divided by zero.");
		}
		finally {
			System.out.println("Program ends. ");
		}


	}

}
