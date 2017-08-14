package tpg.studentsort;

import java.util.LinkedList;
import java.util.List;

public class StudentSortTester {
	
	public static void main(String[] args) {
	
		List<Student> studentList = new LinkedList<Student>();
		Student student1 = new Student("33", "Tina", "3.68");
		studentList.add(student1);
		Student student2 = new Student("85", "Louis", "3.85");
		studentList.add(student2);
		Student student3 = new Student("56", "Samil", "3.75");
		studentList.add(student3);
		Student student4 = new Student("19", "Samar", "3.75");
		studentList.add(student4);
		Student student5 = new Student("22", "Lorry", "3.76");
		studentList.add(student5);
		Student student6 = new Student("37", "Tina", "3.68");
		studentList.add(student6);
		Student student7 = new Student("79", "George", "3.85");
		studentList.add(student7);
		Student student8 = new Student("60", "William", "3.70");
		studentList.add(student8);
		
		StudentComparator studentComparator = new StudentComparator();
		studentList.sort(studentComparator);
		
		for (Student student : studentList){
			System.out.println(student.getId() + " " + student.getName() + " " + student.getGpa());
		}
	
	}

}
