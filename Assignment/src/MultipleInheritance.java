interface PhoneCall{
	void call();
}
interface PhoneText{
	void text();
}
class Phone implements PhoneCall,PhoneText{
	public void call() {
		System.out.println("Calling...");
	}
	public void text() {
		System.out.println("Texting...");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone obj1 =new Phone();
		obj1.call();
		Phone obj2= new Phone();
		obj2.text();
	}
}
