package all_concepts_core_java;

public class Method_overloading {

	public static void main(String[] args) {
		main("hello", 45);
		main(34,"hekel");
		main(88);
		main("Hello");
	}
public static void main(String name, int age) {
	System.out.println(name + " "+ age);
	}
public static void main(int age, String name) {
	System.out.println(age + " "+ name);
}
public static void main(int age) {
	System.out.println(age);
}
public static void main(int age, int phno) {
	System.out.println(age);
}
public static void main(String name) {
	System.out.println(name);
}

	
}
