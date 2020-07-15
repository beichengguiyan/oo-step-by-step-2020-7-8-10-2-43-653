package practice04;

public class Demo {
	public static void main(String[] args) {
		Klass klass = new Klass();
		new Teacher("Matt", 36, "teacher", klass);
		Student student01 = new Student("Tom", 16, klass);
		Student student02 = new Student("John", 16, klass);

		System.out.println("student01 name change: Haven");
		student01.setName("Haven");
	}
}
