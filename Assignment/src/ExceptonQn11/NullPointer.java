package ExceptonQn11;

import java.util.Scanner;

public class NullPointer {
	    public static void main(String[] args) {
	        try{
	            Scanner input =new Scanner(System.in);
	            System.out.println("Enter any string:");
	            String word=input.nextLine();
	            int strlen=word.length();
	            System.out.println("The length of the string is "+strlen);
	        }
	        //An object of this class gets created whenever a member is invoked with a “null” object
	        catch(NullPointerException e){
	            System.out.println("NullPointerException Incurred");
	        }
	    }
	}



