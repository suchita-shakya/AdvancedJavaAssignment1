package ExceptonQn11;

class Person {

    public String name;
    public double Salary;

    public Person() {
    }

    public void personInfo(String name){
         this.name = name;
        System.out.println("The name of the person is "+name);
    }
}
class Politician extends Person{

   public void salary(double salary) {
	   System.out.println("The salary of the "+name+" is "+salary);
   }
	
	/*
	public void Salary(double salary,double tax) {
		System.out.println("The salary of the " + this.name + " is "+(salary-tax));
	}
	*/

    
}
class Sportsman extends Person{
	public void salary(double salary,double tax) {
		   System.out.println("The salary of the "+name+" is "+(salary-tax));
	   }
	
	/*
	public void Salary(double salary,double tax) {
		System.out.println("The salary of the " + this.name + " is "+(salary-tax));
   	}
        */
   

    public Sportsman() {
    }
}
class PersonInheritance {
    public static void main(String[] args) {
    	  Politician politician = new Politician();
    	  politician.personInfo("Hari");
          politician.salary(3000);

          Sportsman sportman= new Sportsman();
          sportman.personInfo("Sita");
          sportman.salary(4556,900);

    }
}
