package all_concepts_core_java;

public class ClassTypeCasting {

	public static void main(String[] args) {
		//UPcaating
		// implicitly
		superlclass sc = new subclass1();
		System.out.println(sc.x);

		// explicitly
		superlclass sc1 = (subclass1) new subclass1();
		System.out.println(sc1.x);
		
		//Downcasting
		//explicitly
		subclass1 s1 =(subclass1) sc1;
		System.out.println(s1.x);
		s1.disp();
	}
}

class superlclass {
	int x = 100;
}

class subclass1 extends superlclass {
	void disp() {
		System.out.println("disp");
	}
}
