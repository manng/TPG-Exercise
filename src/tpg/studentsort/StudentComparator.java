package tpg.studentsort;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		if (!student1.getGpa().equals(student2.getGpa())){
			return -student1.getGpa().compareTo(student2.getGpa());
		} 
		if (!student1.getName().equals(student2.getName())) {
			return student1.getName().compareTo(student2.getName());
		}
		return student1.getId().compareTo(student2.getId());
	}

}
