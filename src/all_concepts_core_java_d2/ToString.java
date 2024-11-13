package all_concepts_core_java_d2;

public class ToString {
	String name;
	int age;
	public ToString(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + " "+ age;
	}
	
	public static void main(String[] args) {
		ToString ts = new ToString("manu", 28);
		System.out.println(ts);
	}
}
