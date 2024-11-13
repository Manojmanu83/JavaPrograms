package all_concepts_core_java;

public class AbstractClass {

	public static void main(String[] args) {
		nextclass imp = new nextclass();
		imp.disp();
		imp.add();
	}

}
abstract class cignesh{
	abstract void disp();
	abstract void add();
}

abstract class impcignesh extends cignesh{
	void disp() {
		System.out.println("disp");
	}
}
class nextclass extends impcignesh{
	@Override
	void add() {
		System.out.println("add");
		
	}
	
}