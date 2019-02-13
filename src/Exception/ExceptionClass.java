package Exception;

public class ExceptionClass extends Exception {
	private int age;
	public ExceptionClass(String s) {
		super(s);
	}
	public ExceptionClass(int s) {
		this.age=s;
	}
	public void setAge(int age) throws ExceptionClass {
		if(age>0&&age<120)
			this.age=age;
		else
			throw new ExceptionClass(" ÄêÁäÔ½½ç"+age);
	}
 }
