package t;

public class demo1<T> {//类名后面加<T>  java不能声明泛型数组
	private T obj;
	public void set(T obj) {
		this.obj=obj;
	}
	public T get() {
		return obj;
	}
	public static void main(String[] args) {
		demo1<Integer> d=new demo1<Integer>();
		d.set(new Integer("5"));
		int i=d.get();
		System.out.println(i);
		String str[]=new String[]{"我","爱","java"};
		show(str);
	}
	public static<T> void show(T t[]) {
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i]);
		}
	}
	
}
