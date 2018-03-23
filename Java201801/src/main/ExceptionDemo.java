package main;

public class ExceptionDemo {
	public static void main(String[] args) {
		Divide d = new Divide();
		try {
			int x = d.div(4, -1);
			System.out.println("x=" + x);
		} catch(NegativeException e) {
			System.out.println(e.toString());
		} catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}

class Divide{
	int div(int a, int b)throws NegativeException {
		if(b < 0) {
			throw new NegativeException("除数出现了负数的情况	/ by negative");
		}			
		return a/b;
	}
}

class NegativeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2823271923578226153L;
	private String msg;
	NegativeException(String m){
		msg = m;
	}
	public String getMessage() {
		return msg;
	}
}