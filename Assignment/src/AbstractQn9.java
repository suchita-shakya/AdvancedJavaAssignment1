abstract class Employee {
    public abstract double netSalary(double grossSalary, double tax);

    public void display(String name) {
        System.out.println(" The Employee name is "+name);
    }

}
class Manager extends Employee{
    
    public double netSalary(double grossSalary, double tax) {
        return (grossSalary - tax);
    }

    public void display(String name) {
        System.out.println("The Manager name is "+name);
    }
}
class Clerk extends Employee{
    
    public double netSalary(double grossSalary, double tax) {
        return (grossSalary - tax);
    }

    @Override
    public void display(String name) {
        System.out.println("The Clerk name is "+name);
    }
}
 public class AbstractQn9{
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.display("Ram");
        System.out.println("The Net Salary is "+manager.netSalary(3900,1000));


        Clerk clerk = new Clerk();
        clerk.display("Hari");
        System.out.println("Net Salary is "+clerk.netSalary(5900,1000));
    }
}
