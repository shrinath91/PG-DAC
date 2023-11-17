package double_End_queue;

public class QueueEmptyException extends Exception
{
	String msg;

	public QueueEmptyException()
	{
		this.msg = "11Queue is Empty!!!";
	}

	@Override
	public String getMessage()
	{
		return msg;
	}
	
	
	
	
	
	
	
}
