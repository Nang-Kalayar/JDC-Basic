public class ElectricCar extends Car {

	private int batteryCapacity;
	public ElectricCar(String model,String color,int year,int door,int batteryCapacity){
		super(model,color,year,door);
		this.batteryCapacity = batteryCapacity;
	}
	public void startEnginge(){
		System.out.println("ElectricCar engine started");
	}
	public void stopEnginge(){
		System.out.println("ElectricCar engine stoppedd");
	}
	@Override
	public String toString(){
		return """
		Model:%s
		Color:%s
		Year: %d
		Door: %d
		Battery: %d"""
		.formatted(getModel(),getColor(),getYear(),getDoor(),getBatteryCapacity());
	}
	@Override
	public void move(){
		System.out.println("ElectricCar is movving");
	}
	public void go(){
		super.move();//super instance
		this.move();//this method
	}
}