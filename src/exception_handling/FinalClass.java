package exception_handling;

public class FinalClass extends sample{
	public static void main(String[] args) {
		Demo d = new Demo();
		sample s = new sample();
		System.out.println(s.x);
		s.add();
		System.out.println(d.x);
	}
	void add(int x) {
		System.out.println(x);
	}
//	void add() {
//		System.out.println("hello");
//	}

}

final class Demo{
//	final Demo(){
//		
//	}
	final int x = 10;
	final void sub() {
		System.out.println("add meth");
	}
}

class sample{
	final int x = 10;
	final void add() {
		System.out.println("add meth");
	}
}
