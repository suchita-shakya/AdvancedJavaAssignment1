import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter any three numbers:");
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		if(a<b && a<c) {
			System.out.println(a+" is smallest number.");
		}
		else if(b<a && b<c){
			System.out.println(b+" is smallest number.");
			
		}
		else {
			System.out.println(c+" is smallest number.");
		}

	}

}
