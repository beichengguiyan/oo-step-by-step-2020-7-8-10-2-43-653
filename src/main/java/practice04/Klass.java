package practice04;

import java.util.ArrayList;
import java.util.List;

public class Klass {
	private int id;
	private Teacher teacher;
	private List<Student> studentList=new ArrayList<Student>();

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		notifyAllPersons();
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
	}

	public void notifyAllPersons() {
		for (Student student : studentList) {
			student.update();
		}
		teacher.update();
	}
}
