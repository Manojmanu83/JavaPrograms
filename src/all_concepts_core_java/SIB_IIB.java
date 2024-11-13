package all_concepts_core_java;

public class SIB_IIB {
	
	public SIB_IIB(){
		System.out.println("Constuctor");
	}
	public static void main(String[] args) {
		System.out.println("Main starts");
		SIB_IIB obj = new SIB_IIB();
		System.out.println("Main MainEnds");
		SIB_IIB obj1 = new SIB_IIB();
	}
	
	static {
		System.out.println("I am static 1");
	}
	
	static {
		System.out.println("I am static 2");
	}
	
	{
		System.out.println("I am iib 1");
	}
	
	{
		System.out.println("I am iib 2");
	}

}
