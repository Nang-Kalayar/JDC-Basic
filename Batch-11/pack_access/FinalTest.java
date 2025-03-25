public class FinalTest{
	@Override
	void show() {
		System.out.println("Final Method in FinalDemo Class");

	}
 public static void main(String[] args) {
 	var obj= new FinalTest();
 	obj.show();
 	
 }
}
class  FinalDemo {
	final void show(){
		System.out.println("Final Method in FinalDemo Class");
	}

}