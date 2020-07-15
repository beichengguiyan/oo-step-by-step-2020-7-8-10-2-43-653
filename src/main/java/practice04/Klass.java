package practice04;

import java.util.ArrayList;
import java.util.List;

public class Klass {
	private int id=1;
	private Teacher teacher;
	private List<Student> studentList=new ArrayList<Student>();

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		notifyAllPersonsAboutClass();
	}
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public void addStudent(Student student) {
		studentList.add(student);
		notifyAllPersonsAboutStudent(student.getName());
	}

	public void notifyAllPersonsAboutClass() {
		teacher.update();
		for (Student student : studentList) {
			student.update();
		}
		
	}
	
	public void notifyAllPersonsAboutStudent(String name) {
		teacher.newStudentNotify(name);
		for (Student student : studentList) {
			student.newStudentNotify(name);
		}
	}
}
