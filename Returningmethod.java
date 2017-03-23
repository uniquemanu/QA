//Java program that calls method in return statement
package callingmethod;

public class Returningmethod 
{
	static int square(int value) 
	{
		// Return number to the power of 2.
		return (int) Math.pow(value, 2);
	}

	    static int getVolume(int size) 
	    {
		// Return squared number.
		return square(size);
	    }

	    public static void main(String[] args) 
	    {
	    // Assign to the return value of getVolume.
		int volume = getVolume(4);
		System.out.println(volume);
	    }
	}

	