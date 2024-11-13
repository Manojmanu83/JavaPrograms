package all_concepts_core_java;

public class Poly {

	public static void main(String[] args) {
		snake s = new snake();
		cat c = new cat();
		Simulator1.ansim(s);
		Simulator1.ansim(c);
	}
}

class Animal {
	void noise() {
		System.out.println("noise");
	}
}

class snake extends Animal {
	void noise() {
		System.out.println("snake noise");
	}
}

class cat extends Animal {
	void noise() {
		System.out.println("cat noise");
	}
}

class Simulator1 {
	static void ansim(Animal a) {
		a.noise();
	}
}
