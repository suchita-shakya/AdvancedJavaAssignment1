import java.util.Scanner;

public class Book {
		// TODO Auto-generated constructor stub
		
		String bookName;
		String ISBN;
		String author;
		double price;
		
		   public  void read(){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the book name:");
			String bookName= input.nextLine();
			this.bookName=bookName;
			System.out.println("Enter the ISBN of the book:");
			String ISBN = input.nextLine();
			this.ISBN=ISBN;
			System.out.println("Enter the author of the book:");
			String author= input.nextLine();
			this.author=author;
			System.out.println("Enter the price of the book:");
			double price = input.nextDouble();
			this.price=price;
			
		   }
		   public void display() {
			   System.out.println("The name of the book is "+bookName+" ,ISBN is "+ISBN+" ,author is "+author+" and price is "+price);
			   
		   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book object= new Book();
		object.read();
		object.display();

	}

}

