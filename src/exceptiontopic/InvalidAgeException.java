package exceptiontopic;


// User Defined Exception / Custom Exception

// checked Excception
//public class InvalidAgeException extends Exception

// Unchecked Excception
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
