package t;

public class 泛型上限<T extends Number>{
	private T obj;
	public void setObj(T obj) {
		this.obj=obj;
	}
	public T getObj() {
		return obj;
	}
	public void show(泛型上限<? extends Number> t) {
		System.out.println(getObj());
	}
	}
	class demo<T>{
		private T obj;
		public void setObj(T obj) {
			this.obj=obj;
		}
		public T getObj() {
			return obj;
		}
		public void show(demo<T> t) {
			System.out.println(getObj());
		}
		
	public static<T extends Number> void info(泛型上限<T> t) {//参数传入的应该是具体实例
		System.out.println(t.getObj());
	}
	/*public static void main(String[] args) {
			泛型上限<Integer> t=new 泛型上限<Integer>();
			t.setObj(5);
			t.show(t);
			info(t);
	}*/
	/*public static void info(泛型上限<? extends Number> t) {
		System.out.println(t.getObj());
	}*/
	public static void info(demo<? super Number> t){
		
	}
}
