package modifier;
import pkg_access.AccessModifier;
// IS-A relationshiop
//ProtectedDemo is a AccessModifier
//BMW. lightturci is a 'Car'
public class ProtectedDemo extends AccessModifier {
	void show(){
		System.out.println("protected Variable" + protectedVariabel);
		protectedMethod();


	}
	public static void main(String[] args) {
		new ProtectedDemo().show();
	}
}