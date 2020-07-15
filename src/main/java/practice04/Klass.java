package practice04;

import java.util.ArrayList;
import java.util.List;

public class Klass {
	private int id;
	private Teacher teacher;
	private List<Student> studentList = new ArrayList<Student>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void notifyAllPersonsAboutStudentNameChange(String formerName, String name) {
		teacher.newStudentNotify(formerName, name);
		for (Student student : studentList) {
			student.newStudentNotify(formerName, name);
		}
	}

	public void notifyAllPersonsAboutStudentClassChange(String name, int id) {
		teacher.update(name, id);
		for (Student student : studentList) {
			student.update(name, id);
		}
	}
	
	public void notifyAllPersonsAboutStudentJoin(String name) {
		teacher.notifyStudentJoin(name);
		for (Student student : studentList) {
			student.StudentJoin(name);
		}
	}

}
