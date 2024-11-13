package all_concepts_core_java;

public class PrimitiveTypeCasting {

	public static void main(String[] args) {
		
		//widning
		double a = 10;//implicitly
		double b = (double) 23;//explicitly
		
		System.out.println(a +" "+ b);
		
		//narrowing
		int z = (int)10.0;//explicitly
		System.out.println(z);
	}

}
