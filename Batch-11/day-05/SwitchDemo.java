(import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		// System.out.println("Enter String:");
		// String str = sc.next();
		//oldstyle(num);
		//switchV2(num);
		//switchV3(str);
		switchV4(num);
		
	}
static String switchV4(int num){
	String result = switch(num){
		case 0,1,2,3,4,5 -> {
			yield "Small Number";
		}
		case 6,7,8,9,10 -> {
			yield "Large Number";
		}
		default -> {
			yield "Invalid!!";
		}
	};
	return result;
}
static void switchV3(String str){

	String result = switch (str) {
	case "1" -> "This is one.";
	case "2" -> "This is two.";
	case "3" -> "This is three.";
	default -> "invalid!!";
	};
	System.out.println("Result =" + result);
}
static void switchV2 (int num){

	if(num == 1)
		System.out.println("One");
	if(num == 2){
		System.out.println("Two");
		System.out.println("Nice");
	}
	switch(num) {
	case 1, 2, 3 -> System.out.println("One , Two , Three");
	case 4 -> System.out.println("Four");
	case 5 -> System.out.println("Five");
	case 6 -> System.out.println("Six");
	case 7 -> System.out.println("Seven");
	case 8 -> System.out.println("Eight");
	case 9 -> System.out.println("Nine");
	case 10 -> System.out.println("Ten");
	default -> System.out.println("Invalid Number");
	}
	System.out.println("Terminated");
}
static void oldstyle(int num){

	switch(num){
	case 1 : System.out.println("One."); break;
	case 2 : System.out.println("Two."); break;
	case 3 : System.out.println("Three."); break;
	case 4 : System.out.println("Four."); break;
	case 5 : System.out.println("Five."); break;
	case 6 : System.out.println("Six."); break;
	case 7 : System.out.println("Seven."); break;
	case 8 : System.out.println("Eight."); break;
	case 9 : System.out.println("Nine."); break;
	case 10 : System.out.println("Ten."); break;
	default : System.out.println("Invalid Number!!"); break;
	}

	System.out.println("Terminated");
}
}