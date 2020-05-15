import java.util.Scanner;

public class Question5 {
	public String name;
	public String address;

	public Question5() {
		// TODO Auto-generated constructor stub
		
	}
	public void readData(String name,String address) {
		this.name=name;
		this.address=address;
		
	}
	public void display() {
		System.out.println("Your name is "+name+" and address is "+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question5 obj=new Question5();
		obj.readData("ram","ktm");
		obj.display();

	}

}
