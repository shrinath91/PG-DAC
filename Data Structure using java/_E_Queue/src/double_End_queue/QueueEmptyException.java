package double_End_queue;

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
