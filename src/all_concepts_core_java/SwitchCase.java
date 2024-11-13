package all_concepts_core_java;

public class SwitchCase {

	public static void main(String[] args) {
		char n = 'B';
		
		switch (n) {
		case 'A': {
			System.out.println("A case");
			break;
		}
		case 'B': {
			System.out.println("B case");
			break;
		}
		default:
			System.out.println("Invalid");
		}

	}

}
