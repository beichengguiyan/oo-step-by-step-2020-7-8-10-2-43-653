package practice04;

public class Demo {
	public static void main(String[] args) {
		Klass klass = new Klass();
		Klass klass02 = new Klass();
		klass.setId(1);
		klass02.setId(2);
		new Teacher("Matt", 36, "teacher", klass);
		new Teacher("Lina", 32, "teacher", klass02);
		Student student01 = new Student("Tom", 16, klass);
		Student student02 = new Student("John", 16, klass);
		Student student03 = new Student("Liming", 15, klass02);

		System.out.println("student01 name change: Haven");
		student01.setName("Haven");
		student01.setKlass(klass02);
	}
}
