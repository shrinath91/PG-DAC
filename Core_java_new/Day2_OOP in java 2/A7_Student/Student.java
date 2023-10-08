class Student
{
private int id;
private float per;

public Student()
{}
public Student(int id, float per)
{
this.id=id;
this.per=per;
}
public void displayGrade()
{
if(per>90)
	System.out.println(" Excellent");
else if(per>80f)
	System.out.println(" Very Good ");
else if(per>70f)
	System.out.println(" Good");
else if(per>60f)
	System.out.println(" Average");
else if(per>40f)
	System.out.println(" Below Average");
else if(per<=40f)
	System.out.println(" Fail");

}

}