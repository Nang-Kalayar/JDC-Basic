package com.jdc.constructor.model.Person;
import java.util.Scanner;
public class ConstructorApplication {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person person = new Person("U Tin Mg");
		
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		person.setName(name);

		System.out.println("Enter age");
		int age = Integer.parseInt (sc.nextLine());
		person.setAge(age);

		System.out.println("Enter Phone: ");
		String phone = sc.nextLine();
		person.setPhone(phone);


		System.out.println("""
								Name: %s
								Age: %d
								Phone: %s""".formatted(person.getName(),
									person.getAge(),
									person.getPhone()
									)
									

							);


			
		sc.close();
	}
}
