package a1_pwd;

public class PasswordTooShort extends Exception {
	
	String msg;

	public PasswordTooShort() {
		super();
		this.msg = "PassWord too short!!!";
	}
	
	public String toString()
	{
		return this.msg;
	}

}
