package all_concepts_core_java;

class resturant{
	void byriyani() {
		System.out.println("Byriyani");
	}
	void dosa() {
		System.out.println("dosa");
	}
}

public class zomato {
	public static void main(String[] args) {
		resturant r = new resturant();
		customer.orderfood(r);
	}
}

class customer{
	static void orderfood(resturant r) {
		r.byriyani();
		r.dosa();
	}
}



//int a =9;
//
//static void square(PassByRef ref) {
//	System.out.println(ref.a*ref.a);
//}
//
//public static void main(String[] args) {
//	PassByRef ref = new PassByRef();
//	square(ref);
//}