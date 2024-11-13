package all_concepts_core_java;

interface Facebookint {
	default void disp() {
		System.out.println("default");
	}
	static void add() {
		System.out.println("static");
	}
	abstract void signup();
}
public class Facebook implements Facebookint{

	@Override
	public void signup() {
		System.out.println("this is abstract method");
	}
	
	public static void main(String[] args) {
		Facebook ic = new Facebook();
		ic.disp();
		ic.signup();
		Facebookint.add();
	}
	
}
