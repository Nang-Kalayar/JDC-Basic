public class MainApp{
	
	public static void main(String[] args) {
		LivingThings lv = new Human();
		lv.breath();
		lv = new Fish();
		lv.breath();

		lv = new Bird();
		lv.breath();
	}
}