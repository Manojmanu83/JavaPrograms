package all_concepts_core_java_d2;

public class EqualsMeth {

	String name;
	int age;
	public EqualsMeth(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object o) {
		EqualsMeth e = (EqualsMeth) o;
		return this.age == e.age;
	}
	public static void main(String[] args) {
		EqualsMeth e1 = new EqualsMeth("manu", 30);
		EqualsMeth e2 = new EqualsMeth("sanu", 30);
		if(e1.equals(e2))
			System.out.println("equal");
		else
			System.out.println("not equal");
	}

}
