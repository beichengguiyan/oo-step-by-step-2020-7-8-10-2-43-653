package practice02;

public class Teacher extends Person {
	private String job;

	public Teacher(String name, int age, String job) {
		super(name, age);
		this.job = job;
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
}
