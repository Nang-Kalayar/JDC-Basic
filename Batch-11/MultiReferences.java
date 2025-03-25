public class MultiReferences {
	public static void main(String[] args) {
		
		// instantiate - create an object
		
		Data d1 = new Data("D1");

		d1.countUp(); //  D1 : 1

		Data d2 = d1; // D1 : 1

		Data d3 = d2; // D1 : 1
 
		d3.setName("D3"); // D3 : 1

		d3.countUp(); 	// D3 : 2
	}
}

class Data {

	private String name; // null
	private int value;   // 0

	Data(String name) {
		this.name = name;
	}

	void setName(String name){
		this.name = name;
	}

	void countUp(){
		++ value;
		System.out.println("Name : " + " : " + value);
	}
}