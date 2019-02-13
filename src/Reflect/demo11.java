package Reflect;

import java.lang.reflect.Array;

public class demo11 {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		Class cArray=num.getClass().getComponentType();
		System.out.println("数组元素类型"+cArray.getName());
		System.out.println("数组元素个数"+Array.getLength(num));
		System.out.print("修改前数组元素为:");
		for(int i=0;i<Array.getLength(num);i++)
			System.out.print(Array.get(num, i)+"  ");
		System.out.println("修改后:");
		for(int i=0;i<Array.getLength(num);i++) {
			Array.set(num, i, 2*i+1);
			System.out.print(Array.get(num, i)+"  ");
		}
	}
}
