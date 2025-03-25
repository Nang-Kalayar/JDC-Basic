package pkg_access;

public class AccessModifier {
	
	public int publicVariable = 10;
	int defaultVariable = 20;
	protected int protectedVariable = 30;
	private int privateVariable = 40;

	public void publicMethod(){
		System.out.println("Public Method.");
		System.out.println(publicVariable);
	}

	void defaultMethod(){
		System.out.println("Default Method.");
		System.out.println(defaultVariable);
	}

	protected void protectedMethod(){
		System.out.println("Protected Method.");
		System.out.println(protectedVariable);
	}

	private void privateMethod(){
		System.out.println("Private Method.");
		System.out.println(privateVariable);
	}
}