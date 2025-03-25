public class Rectangle extends Shape {
	public Rectangle(double base,double height){
		super(base,height);
	}
}
public class Test{
	public static void main(String[] args) {
		var s = new Rectangle(20,10);
		s.showArea();
	}
}