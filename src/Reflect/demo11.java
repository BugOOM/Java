package Reflect;

import java.lang.reflect.Array;

public class demo11 {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		Class cArray=num.getClass().getComponentType();
		System.out.println("����Ԫ������"+cArray.getName());
		System.out.println("����Ԫ�ظ���"+Array.getLength(num));
		System.out.print("�޸�ǰ����Ԫ��Ϊ:");
		for(int i=0;i<Array.getLength(num);i++)
			System.out.print(Array.get(num, i)+"  ");
		System.out.println("�޸ĺ�:");
		for(int i=0;i<Array.getLength(num);i++) {
			Array.set(num, i, 2*i+1);
			System.out.print(Array.get(num, i)+"  ");
		}
	}
}
