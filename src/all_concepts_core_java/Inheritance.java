package all_concepts_core_java;

public class Inheritance {

	public static void main(String[] args) {
		thirdclass s = new thirdclass();
		System.out.println(s.x);
		s.disp();
		s.add();
		hierarchical s1 = new hierarchical();
		System.out.println(s1.x);
		s1.disp();
		s1.sub();
	}
}

	class SLI{
		int x =90;
	}
	class subclass extends SLI{
		void disp() {
			System.out.println("hello");
		}
	}
	class thirdclass extends subclass{
		void add() {
			System.out.println("multi-level");
		}
	}
	
	class hierarchical extends subclass{
		void sub() {
			System.out.println("hierarcical");
		}
	}
