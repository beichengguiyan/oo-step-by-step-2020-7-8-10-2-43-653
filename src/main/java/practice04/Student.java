package practice04;

public class Student extends Person {
	private Klass klass;

	public Student(String name, int age, Klass klass) {
		super(name, age);
		this.klass = klass;
		this.klass.addStudent(this);
	}

	public void setKlass(Klass klass) {
		this.klass = klass;
	}

	public Klass getKlass() {
		return klass;
	}

	@Override
	public String introduce() {
		return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Student of Class "
				+ klass.getId() + ".";
	}

	@Override
	public void setName(String name) {
		this.klass.notifyAllPersonsAboutStudentNameChange(super.getName(), name);
		super.setName(name);
	}

	public void newStudentNotify(String Formername, String name) {
		System.out.println("学生" + super.getName() + "收到通知：班级编号为" + klass.getId() + "学生" + Formername + "更名为" + name);
	}

	public void update() {
		System.out.println("学生" + super.getName() + "班级编号为" + klass.getId());
	}

}
