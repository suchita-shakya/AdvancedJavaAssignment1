package ExceptonQn11;

import java.util.Scanner;

public class StringOutofBoundException {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the input text: ");
	        try{
	            char c = scanner.nextLine().charAt(4);
	            System.out.println("The character at index 4 is : "+c);
	        }catch(Exception e){
	          
	            System.out.println("Caught exception : "+e.toString());
	        }
	    }
	}


