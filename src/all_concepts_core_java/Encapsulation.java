package all_concepts_core_java;

public class Encapsulation {
		private int pass =8989;
		public int getpass() {
			return pass;
		}
		public void setpass(int pass) {
			this.pass = pass;
		}
		
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		System.out.println(e.getpass());
		e.setpass(6644);
		System.out.println(e.getpass());
	}

}
