package Exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		ExceptionClass ec=new ExceptionClass("qwer");
		try {
			ec.setAge(130);
		}
		catch(ExceptionClass e) {
			e.printStackTrace();
		}
}
}