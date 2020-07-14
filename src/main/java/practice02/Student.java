package practice02;

public class Student extends Person {
    private int klass;

    public Student(String name, int age, int klass){
        super(name,age);
        this.klass = klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Student of Class "+klass+".";
    }
}
