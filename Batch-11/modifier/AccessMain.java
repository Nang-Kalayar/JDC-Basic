package modifier;

import pkg_access.AccessModifier;
public class AccessMain {
	public static void main(String[] args) {

		// public - can access from anywhere
		//default- can access within his package
		//private-can access only within his owner class
		AccessModifier obj = new AccessModifier();

		obj.publicVariable = 100;
		obj.publicMethod();
		System.out.println();

		//obj.defaultVariable = 200;
		//obj.defaultMethod();

		obj.defaultVariabel = 400;
		obj.defaultMethod ();

	}
}