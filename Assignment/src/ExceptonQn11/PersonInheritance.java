package ExceptonQn11;

class Person {

    private String name;
    private double Salary;

    public Person() {
    }

    public void PersonInfo(String name){
         this.name = name;
        System.out.println("The name of the person is "+name);
    }
}
class Politician extends Person{

   public void Salary(double salary) {
	   System.out.println("The salary of the is "+salary);
   }

    
}
class Sportsman extends Person{
	public void Salary(double salary,double tax) {
		   System.out.println("The salary of the is "+(salary-tax));
	   }
   

    public Sportsman() {
    }
}
class PersonInheritance {
    public static void main(String[] args) {
    	  Politician politician = new Politician();
    	  politician.PersonInfo("Hari");
          politician.Salary(3000);

          Sportsman sportman= new Sportsman();
          sportman.PersonInfo("Sita");
          sportman.Salary(4556,900);

    }
}
