public class Car{
	String type;
	String model;

	Car(String type,String model){
		this.type = type;
		this.model = model;
	}

	void showInfo(){
		System.out.println("Type: " + type);
		System.out.println("Model: " + model);
	}
}