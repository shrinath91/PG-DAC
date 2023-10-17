package comparer_util;

import Student.Student;

public class NameComparer implements Comparer {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = null, s2 = null;
		if(o1 instanceof Student)
			s1 = (Student)o1;
		if(o2 instanceof Student)
			s2 = (Student)o2;
		
		return s1.getName().compareTo(s2.getName());
	}

}

//
//Comparer c2= new SidComparer();
//
//for(i=0; i<s.length;i++)
//{
//	for(int j=i+1; j<s.length; j++)
//	{
//		if(c2.compare(s[i],s[j])>0)
//		{
//			Student temp=s[i];
//			s[i]=s[j];
//			s[j]=temp;
//		}
//	}
//}
//System.out.println("sort by id");
//for(i=0;i<5;i++)
//{
//	System.out.println(s[i]);
//}
//System.out.println("\n\n\n\n");