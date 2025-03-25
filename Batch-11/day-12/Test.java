public class Test{
	String name;

	public static void main(String[] args) {
		checkTest("Nang");

	}
	//public void Test(String name){
		//this.name = name;
	//}



	 public  static void checkTest(String n){
		if(n != null && !n.isEmpty()){

		System.out.println("Excellent!");
	}else {
		System.out.println("Err");
	}


	}

}