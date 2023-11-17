package a1_student_hashcode;

public class Student
{
	int studentid;
	String name;
	String city;
	double percentage;

	public Student(int studentid, String name, String city, double percentage)
	{
		super();
		this.studentid = studentid;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}

	public int hashCode()
	{
		int hv = 0;
		if(city.equals("Mumbai"))
			hv=10;
		else if(city.equals("Pune"))
			hv=5;
		else if(city.endsWith("Goa"))
			hv=3;
		else
			hv=1;

		return hv;
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "[\nS ID: "+studentid+"\nName: "+name+"\nCity: "+city+"\nPerCentage: "+percentage+"]";
	}




}
