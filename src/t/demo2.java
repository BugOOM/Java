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
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵķ������
	public void show() {
		System.out.println("����"+getObj1()+"����"+getObj2());
	}
	public static void main(String[] args) {
		demo2<?,?> d1=new demo2<String,Integer>("С��",24);
		//ʹ��ͨ������ö���ʱ����ʹ��set�����޸ı�����ָ��������
		//ͨ���ԭ����������������������Ǵ����࣬��class demo<? extends Number>Ϊ��
		
	}
}
