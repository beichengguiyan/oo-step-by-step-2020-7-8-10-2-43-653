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

	public void notifyAllPersonsAboutStudentNameChange(String Formername,String name) {
		teacher.newStudentNotify(Formername,name);
		for (Student student : studentList) {
			student.newStudentNotify(Formername,name);
		}
	}
	
	public void notifyAllPersonsAboutStudentClassChang() {
		teacher.update();
		for (Student student : studentList) {
			student.update();
		}
		
	}
	
}
