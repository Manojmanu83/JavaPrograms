package all_concepts_core_java;

public class Constructor {
	public String name;
	public int age;
	public Constructor(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		Constructor c = new Constructor("manu", 89);
		System.out.println(c.name + " "+ c.age );
	}

}
