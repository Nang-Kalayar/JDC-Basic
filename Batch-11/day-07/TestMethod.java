public class TestMethod {
	public static void main(String[] args) {
		sayHello();
		// instance method
		TestMethod obj = new TestMethod();
		obj.showAddResult(10,20);
		int result = add(20,20);
		System.out.println(result);
		OtherMethod.showMessage("This is static method called from another file of static method");
		
	}
	static void sayHello(){
		System.out.println("Hello");
	}
	// instance method withod static to create obj by it's classname to call method
	 void showAddResult(int a,int b){
		System.out.println(a + b);

	}
	static int  add(int a, int b){
		 return a+b;
	

	}
}