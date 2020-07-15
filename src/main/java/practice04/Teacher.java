package practice04;

public class Teacher extends Person {
	private String job;
	private Klass klass;


	public Teacher(String name, int age, String job, Klass klass) {
		super(name, age);
		this.job = job;
		this.klass = klass;
		this.klass.setTeacher(this);
	}

	public Klass getKlass() {
		return klass;
	}

	public void setKlass(Klass klass) {
		this.klass = klass;
	}
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String introduce() {
		return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a Teacher";
	}

	public void update() {
		System.out.println("老师"+super.getName()+"班级编号为" + klass.getId());
	}
	
	public void newStudentNotify(String name) {
	      System.out.println("老师"+super.getName()+"收到通知：班级编号为"+klass.getId() +"新增学生"+name); 
	}
}
