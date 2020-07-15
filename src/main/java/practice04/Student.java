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

	public void update() {
	      System.out.println("学生"+super.getName()+"班级编号为"+klass.getId() ); 
	}
}
