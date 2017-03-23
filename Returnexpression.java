//Java program that returns expression
package callingmethod;

public class Returnexpression 
{
	    static int computeSize(int height, int width) 
	    {
		// Return an expression based on two arguments (variables).
		return height * width;
	    }

	    public static void main(String[] args) 
	    {
		int result = computeSize(10, 3);
		System.out.println(result);
	    }
}
