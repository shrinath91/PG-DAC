package a1_employee;

public class QueueEmptyException extends RuntimeException
{
	String msg;

	public QueueEmptyException()
	{
		this.msg = "Queue is Empty!!!";
	}

	@Override
	public String getMessage()
	{
		return msg;
	}
	
	
	
	
	
	
	
}
