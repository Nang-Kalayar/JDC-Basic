public class FinalDemo{
	//var i = 10;
	//final value initialize
	public static final int count = 100; //0
	public static void main(String[] args) {

//count = 200; cannot override final value
		System.out.println("Final Value:" + count);

		//var -not global,but must be local.
		var obj=new FinalClass();
		obj.name = "Aung";
		obj.show();
	}
	
}
class finalClass{
	string name;
	 void show() {
	 	System.out.println( "I am" + name);
	 }
}