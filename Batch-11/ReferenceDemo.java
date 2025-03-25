public class ReferenceDemo {
	public static void main(String[] args) {
		Student s1=new Student ("Aung Aung");
		sayHello(s1);
		s1 =new Student ("Mg Mg");
		sayHello(s1);
	}
	static void sayHello(Student student) {
		student.greet();

	}

}
class Student {
	private String name;
	Student (String name) {
		this.name=name;
	}
	void greet(){
		System.out.println("Hi I am  " + name);
		
	} 
