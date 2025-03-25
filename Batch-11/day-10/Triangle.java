public class Triangle extends Shape{
	public Rectangle(double base,double height){
		super(base,height);
	}
	@Override
	public void showArea(){
		System.out.println((base*height) /2);
	}
}