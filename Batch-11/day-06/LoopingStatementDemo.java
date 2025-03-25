public class LoopingStatementDemo{
	public static void main(String[] args) {
		forLoopDemo();
		whileDemo();
	}
	static void whileDemo(){
		int i = 0;
		int num = 5;
		while(i < 100){
			if(i % num == 0 )
				System.out.println(i + " is even");
			i++;
		}
	}
	static void forLoopDemo(){
		for(int i=0,num=2; i < 10 ; i++){
			if(i % num == 0)
				System.out.println(i + "is Even.");
		}
	}
}