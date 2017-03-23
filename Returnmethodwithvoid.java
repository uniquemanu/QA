//Java program that uses return statement, void method
package callingmethod;

public class Returnmethodwithvoid 
{
	static void displayPassword(String password) 
	{
		// Write the password to the console.
		System.out.println("Password: " + password);
		// Return if our password is long enough.
		if (password.length() >= 5) 
		{
		    return;
		}
		System.out.println("Password is too short!");
		// An implicit return is here.
	    }

	    public static void main(String[] args) {
		displayPassword("abc123");
		displayPassword("123");
	    }
	}

	