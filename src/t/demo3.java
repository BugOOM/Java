package t;

public class demo3<T>{
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
		public static void main(String[] args) {
			demo3<Integer> d=new demo3<Integer>();
			d.setObj(new Integer(5));
			info(d);
		}
		public static<T extends Number> void info(demo3<T> t) {
			System.out.println(t);
		}
		
		 
		
}
