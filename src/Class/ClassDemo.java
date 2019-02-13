package Class;

public class ClassDemo {
	public static void main(String[] args) {
		Class c1=new Class(8,16,36);
		Class c2=new Class(26,66,66);
		Class c3=new Class(c1);
		System.out.printf("%s\n",c1.getTime());
		System.out.printf("%s\n",c1.toString());
		System.out.printf("%s\n",c2.getTime());
		System.out.printf("%s\n",c2.toString());
		System.out.printf("%s\n",c3.getTime());
		System.out.printf("%s\n",c3.toString());
		
		
	}

}
