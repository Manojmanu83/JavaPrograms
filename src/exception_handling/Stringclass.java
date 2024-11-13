package exception_handling;

public class Stringclass {

	public static void main(String[] args) {
		String s = "hello";
		String s1 = "hello";
		String ss = new String("hi");
		String ss1 = new String("hi");
		
//		== equlas
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		System.out.println(ss==ss1);
		System.out.println(ss1.equals(ss));
	}

}
