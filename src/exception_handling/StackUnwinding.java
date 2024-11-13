package exception_handling;

public class StackUnwinding {

	void disp1() {
		disp2();
	}
	 void disp2() {
		disp3();
	}
	void disp3() {
		int i = 1/0;
		System.out.println(i);
	}
	public static void main(String[] args) {
		StackUnwinding s = new StackUnwinding();
		try {
		s.disp1();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}
	

}
