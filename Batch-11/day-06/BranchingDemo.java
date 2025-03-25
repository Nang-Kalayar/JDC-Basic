public class BranchingDemo{
	public static void main(String[] args) {
		// returnDemo();
		// breakDemo();
		// continueDemo();
		LabelDemo();

	}
	static void LabelDemo(){
		//label
		outer:
		for ( int i = 0;i < 3; i ++){
			inner:
			for (int j = 0; j < 3; j++)	{
				if (j == 1)
					break inner;
				//continue outer;
			System.out.println("Outer i: " + i + " || " +"Inner j " + j +"\n" );
			}
			

		}
	}
	static void returnDemo(){
		for (int i = 10, num = 0; i > num; i--){
			if(isEven(i)) {
				System.out.println(i + "is even");
				//return;
			}
			
		}
		System.out.println("Terminated");
	}
	static boolean isEven(int num){
		if(num % 2 == 0)
			return true;
		return false;
	}
	static void breakDemo(){
		for (int i = 10, num = 0; i > num; i --) {
			if (i == 5)
				break;
				System.out.println(i + "");
		}
		System.out.println("Terminated");
	}
	static void continueDemo(){
		for (int i = 10 , num = 0; i > num; i --){
					if(i == 5)
					continue;
					System.out.println(i +"");
				}
		System.out.println("Terminated");	
		}	
}
