package all_concepts_core_java;

public class Whatsapp_v1{
	
    public static void main(String[] args) {
		Whatsapp_v2 v2 = new Whatsapp_v2();
		v2.send(100);
	}
}
    
class Whatsapp{
	void send(int number) {
		System.out.println(number);
	}
}



class Whatsapp_v2 extends Whatsapp{
	void send(int number) {
		System.out.println("this is number "+"text");
		super.send(10);
	}
}

