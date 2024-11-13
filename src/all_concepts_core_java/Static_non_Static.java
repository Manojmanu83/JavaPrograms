package all_concepts_core_java;

class outsideCalss {
	
	static int s;
	int ns;
	static void add() {
		System.out.println("hwllo I am static");
	}
	
	void sub() {
		System.out.println("NON static");
	}
//	public static void main(String[] args) {
//		Static_non_Static obj = new Static_non_Static();
//		System.out.println(s);
//		System.out.println(obj.ns);
//		add();
//		obj.sub();
//	}

}

public class  Static_non_Static{
	public static void main(String[] args) {
		outsideCalss obj = new outsideCalss();
		System.out.println(outsideCalss.s);
		System.out.println(obj.ns);
		outsideCalss.add();
		obj.sub();
	}
}
