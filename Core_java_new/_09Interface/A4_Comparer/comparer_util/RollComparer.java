package comparer_util;

import Student.Student;

public class RollComparer implements Comparer {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = null, s2 = null;
		if(o1 instanceof Student)
			s1 = (Student)o1;
		if(o2 instanceof Student)
			s2 = (Student)o2;
		return s1.getRoll() - s2.getRoll();
		
	}

}
