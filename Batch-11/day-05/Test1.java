public class Test1 {
	public static void main(String[] args) {
		Student aung = new Student();
		aung.name = "Aung Aung";
		aung.age = 20;
		Student maung = new Student();
		maung.name = "Maung Maung";
		maung.age = 24;
		aung.greet();
		maung.greet();
	}
}
	/*	checkAge(20);
	}
	//static void checkAge (int age) {
		//if (age < 18) {
			System.out.println("Access denied,You are not old enough");
		}else {
			System.out.println("Access granted!, You are old enough"); }
		}*/

		class Student{
			String name;
			int age;
			void greet( ){
			System.out.println("My name is " + name);
			System.out.println("My age is " + age);
		}



		}
	
	


