package exception_handling;

class olaException extends Exception{
	String msg;
	olaException(String msg){
		this.msg = msg;
	}
	public String getmsg() {
		return msg;
	}
}

public class CreateException {
	
	public void ride(int pass) throws olaException {
		
		if(pass<4)
			System.out.println("happy journey");
		else
			throw new olaException("Invalid no of passengers");
	}

	public static void main(String[] args) {
		CreateException c = new CreateException();
		try {
			c.ride(4);
		} catch (olaException e) {
			System.out.println(e.getmsg());
//			e.printStackTrace();
		}
	}

}
