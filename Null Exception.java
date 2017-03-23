//Java program that causes NullPointerException
public class Program 
{
    public static void main(String[] args) 
    {

	// An input string.
	String name = "Abc";
	System.out.println(name.length());

	// When string is null, an exception occurs.
	name = null;
	System.out.println(name.length());
    }
}
