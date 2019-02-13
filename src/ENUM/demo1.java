package ENUM;

public class demo1 {
	public static void main(String[] args) {
		for(int i=0;i<demo2.values().length;i++)
			System.out.println("枚举名称"+demo2.values()[i].name()+"枚举索引"+demo2.values()[i].ordinal()+"   "+demo2.values()[i].show());
		 }
}
