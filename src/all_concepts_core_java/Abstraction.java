package all_concepts_core_java;

public class Abstraction {

	public static void main(String[] args) {
		snake1 s = new snake1();
		cat1 c = new cat1();
		simulator.ansim(s);
		simulator.ansim(c);
	}

}

interface Animals{
	void noise();
}

class snake1 implements Animals{

	@Override
	public void noise() {
		System.out.println("snake noise");
	}
	
}
class cat1 implements Animals{

	@Override
	public void noise() {
		System.out.println("cat noise");
	}
	
}
class simulator {
	static void ansim(Animals a) {
		a.noise();
	}
}