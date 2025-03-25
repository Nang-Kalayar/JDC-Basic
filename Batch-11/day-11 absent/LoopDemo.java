public class LoopDemo{
	static final int [] outer;
	static final int [] inner;


	outer = {1,2,3,4,5};
	inner = {1,2,3,4,,5,6,7,8,9,10};


	public static void main(String[] args) {
		for(int i = 0; i<outer.length; i ++){
			System.out.println("Outer: " +outer[i]);

			for (int j = 0; j<inner.length; j ++){
				System.out.println("Inner: " +inner[j]);
			}
		}
	}
}