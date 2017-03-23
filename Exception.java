//Java program that uses finally block
public class Exception 
{
    public static void main(String[] args) 
    {

	try 
	{
	    System.out.println("Using try block");
	} 
	finally 
	{
	    // The finally is run even if no exception occurs.
	    System.out.println("Using finally block");
	}
	System.out.println("Result");
    }
}
