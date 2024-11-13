package all_concepts_core_java;

public class PassByValue {

	void square(int a) {
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		int a  = 10;
		new PassByValue().square(a);
	}

}
