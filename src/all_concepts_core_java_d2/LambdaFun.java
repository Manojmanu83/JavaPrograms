package all_concepts_core_java_d2;

public class LambdaFun {

	public static void main(String[] args) {
//		honey h = ()-> {System.out.println("signin");};
		honey h = ()-> {return "hello";};
		h.signin();
		var x = 10;
		var y = "hello";
		var z = new LambdaFun();
//		var allows developers to declare local variables without specifying the data type
	}

}

interface honey{
//	void signin();
	String signin();
}