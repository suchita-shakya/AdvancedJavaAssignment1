
public class Person {
	String Name;
	Double Salary;

	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String Name, double Salary){
        this.Name = Name;
        this.Salary = Salary;
        System.out.println("Name of a person is "+Name);
        System.out.println("Total Salary: "+Salary);
    }
//    public double calculateSalary(double bonusSalary){
//        return (baseSalary + bonusSalary);
//
//    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
public class Politician extends Person{
	
}
