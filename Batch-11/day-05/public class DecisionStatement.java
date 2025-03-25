import java.util.Scanner;
public class DecisionStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		ifDemo(n);
		System.out.println();

		System.out.print("Enter a string : ");
		String st = sc.next();
		ifElseDemo (st);
	}



	
	static void ifElseDemo (String str) {
		if (str.equals("Sunny")) {
			System.out.println("Go Outside");
		}else {
			System.out.println("Stay Home");
		}
	}

	static void ifDemo(int num) {
		if (num % 2== 0 ) {
			System.out.println("It is even.");
		}
		System.out.println("Terminated!");

	}
}
