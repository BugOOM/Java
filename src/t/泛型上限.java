package t;

public class ��������<T extends Number>{
	private T obj;
	public void setObj(T obj) {
		this.obj=obj;
	}
	public T getObj() {
		return obj;
	}
	public void show(��������<? extends Number> t) {
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
		
	public static<T extends Number> void info(��������<T> t) {//���������Ӧ���Ǿ���ʵ��
		System.out.println(t.getObj());
	}
	/*public static void main(String[] args) {
			��������<Integer> t=new ��������<Integer>();
			t.setObj(5);
			t.show(t);
			info(t);
	}*/
	/*public static void info(��������<? extends Number> t) {
		System.out.println(t.getObj());
	}*/
	public static void info(demo<? super Number> t){
		
	}
}
