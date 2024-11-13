package all_concepts_core_java_d2;

public class Hashcode {

	public int hashCode() {
		return 123;
	}
	public static void main(String[] args) {
		Hashcode h = new Hashcode();
		Hashcode h1 = h;
		System.out.println(h.hashCode());
		System.out.println(h1.hashCode());
	}

}
