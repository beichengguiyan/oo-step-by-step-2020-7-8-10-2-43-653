package practice04;


public class Demo {
	   public static void main(String[] args) {
	      Klass klass = new Klass();
	      new Teacher("Matt",36,"teacher",klass);
	      new Student("Tom",16,klass);
	      new Student("John",16,klass);
	      
	 
	      System.out.println("Class id change: 15");   
	      klass.setId(15);
	   }
	}
