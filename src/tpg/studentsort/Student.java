package tpg.studentsort;

import java.io.Serializable;

public class Student implements Serializable {
	
	private String id;
	private String name;
	private String gpa;
	
	public Student(String id, String name, String gpa) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGpa() {
		return gpa;
	}
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
}
