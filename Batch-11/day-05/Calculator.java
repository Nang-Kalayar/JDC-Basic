import java.util.Scanner;
public class Calculator{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//welcome
		welcome();

		//input num1,num2
		System.out.println("Enter Num1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter Num2 :");
		int num2 = sc.nextInt();

		//operator
		System.out.println("Enter Operator(+,-,*,/)");
		char op = sc.next().charAt(0);

		//Calculator(num1 , num2 , operator)
		calculator(num1,num2,op);

		//bye bye
		bye();
		
	}
	static void welcome(){
		System.out.println("*************************");
		System.out.println("*                       *");
		System.out.println("* Welcome to my Program *");
		System.out.println("*                       *");
		System.out.println("*************************");
		
	}

	static void calculator(int n1,int n2,char op){
		if(op == '+'){
			System.out.println("Result: " + (n1+n2));
		} else if (op == '-'){
			System.out.println("Result: " + (n1-n2));
		}else if (op == '*'){
			System.out.println("Result: " + (n1*n2));
		}else if (op == '/'){
			System.out.println("Result: " + (n1/n2));
		}else {
			System.out.println("Invalid!!");
		}
	}

	static void calculator1(int n1,int n2,char op){
		switch(op){
		case "+" -> System.out.println("Result: " + (n1+n2));
		case "-" -> System.out.println("Result: " + (n1+n2));
		case "*" -> System.out.println("Result: " + (n1+n2));
		case "/" -> System.out.println("Result: " + (n1+n2));
		}
	}

	static void bye(){
		System.out.println("***********");
		System.out.println("*         *");
		System.out.println("* Bye Bye *");
		System.out.println("*         *");
		System.out.println("***********");
		
	}
}