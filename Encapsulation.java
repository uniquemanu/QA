package mypackage;
	class EmployeeCount
	{
	   private int NoOfEmployees = 0;
	   public void setNoOfEmployees (int count)
	   {
	       NoOfEmployees = count;
	   }
	   public double getNoOfEmployees () 
	   {
	       return NoOfEmployees;
	   }
	}
	class Encapsulation
	{
	   public static void main(String args[])
	   {
	      System.out.println("Starting EmployeeCount...");
	      EmployeeCount employeeCount = new EmployeeCount ();
	      employeeCount. setNoOfEmployees (12003);
	      System.out.println("NoOfEmployees = " + employeeCount. getNoOfEmployees ());
	    }
	}

