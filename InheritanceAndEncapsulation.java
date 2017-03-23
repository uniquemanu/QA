package mypackage;

public class InheritanceAndPolymorphism {
	abstract public class Employee {
		   private String name;
		   public Employee(String ename) { 
		      name = ename;
		   }
		   public String getName() {
		      return name;
		   }
		   private void setName(String name) {
		      this.name = new String(name);
		   }
		   abstract public double pay();
		   public String toString() {
		       return "name is" + name;
		   }
		}
		public class Salaried extends Employee {
		   double salary;
		   public Salaried(String name, double s) {
		      super(name);
		      salary =s;
		   }
		   public void setSalary(double salary) {
		      this.salary = salary;
		   }
		   public double getSalary() {
		      return salary;
		   }
		   public double pay() {
		      return salary;
		   }
		   public String toString(){
		      return super.toString() + " (salary is " +salary+")"; 
		   }
		}

}
