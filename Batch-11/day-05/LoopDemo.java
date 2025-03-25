public class LoopDemo {
	public static void main(String[] args) {
		//forLoop();
		whileLoop();

	}
	static void forLoop(){
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 0)
				System.out.println( i + " is even.");
		}
	}
	static void whileLoop(){
		int i = 0;
		int num = 5;

		while(i < num){
			System.out.println("This is while loop.");
			i++;
		}
	}
}