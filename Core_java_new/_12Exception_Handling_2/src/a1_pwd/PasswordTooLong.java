package a1_pwd;

public class PasswordTooLong extends Exception {

	String msg;

	public PasswordTooLong() {
		super();
		msg = "Password too long!!!";
	}
	
	public String toString()
	{
		return msg;
	}
	
	
}
