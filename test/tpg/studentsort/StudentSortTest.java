package tpg.studentsort;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class StudentSortTest {
	
	public static List<Student> studentList;
	public static List<Student> unsortedStudentList;
	
	@BeforeClass
	public static void setup(){
		studentList = new LinkedList<Student>();
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
		unsortedStudentList = new LinkedList<Student>(studentList);
		StudentComparator studentComparator = new StudentComparator();
		studentList.sort(studentComparator);
		
		for (Student student : studentList){
			System.out.println(student.getId() + " " + student.getName() + " " + student.getGpa());
		}
	}

	@Test
	public void testSize() {		
		assertEquals(studentList.size(), unsortedStudentList.size());
	}
	
	@Test
	public void testFirst(){		
		assertNotEquals(studentList.get(0), unsortedStudentList.get(0));
	}
	
	@Test
	public void testLast(){
		assertNotEquals(studentList.get(studentList.size()-1), unsortedStudentList.get(unsortedStudentList.size()-1));
	}

}
