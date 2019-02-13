package t;

public class demo2<T,S> {
	private T obj1;
	private S obj2;
	public demo2() {
		
	}
	public demo2(T obj1,S obj2) {
		setObj1(obj1);
		setObj2(obj2);
	}
	private void setObj2(S obj2) {
		// TODO 自动生成的方法存根
		this.obj1=obj1;
	}
	private void setObj1(T obj1) {
		this.obj2=obj2;
	}
	public T getObj1() {
		return obj1;
	}
	public S getObj2() {
		return obj2;
	}
		// TODO 自动生成的方法存根
	public void show() {
		System.out.println("姓名"+getObj1()+"年龄"+getObj2());
	}
	public static void main(String[] args) {
		demo2<?,?> d1=new demo2<String,Integer>("小刚",24);
		//使用通配符设置对象时不能使用set方法修改被泛型指定的内容
		//通配符原来声明泛型类变量，而不是创建类，如class demo<? extends Number>为错
		
	}
}
