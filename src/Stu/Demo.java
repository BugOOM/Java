package Stu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 这是我的学生管理系统的主类
 * 
 * 步骤如下：
 * A:定义学生类
 * B:学生管理系统的主界面的代码编写
 * C:学生管理系统的查看所有学生的代码编写
 * D:学生管理系统的添加学生的代码编写
 * E:学生管理系统的删除学生的代码编写
 * F:学生管理系统的修改学生的代码编写
 */
public class Demo{
	public static void main(String[] args) {
		//创建集合对象，用于存储学生数据
		ArrayList<Student> array=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("请输入你的选择");
		System.out.println("1 添加学生");
		System.out.println("2 显示所有学生信息");
		System.out.println("3 删除学生");
		System.out.println("4 update学生");
		System.out.println("5 保存到文件");
		System.out.println("6 从文件读取");
		System.out.println("7 查询");
		int Choice=sc.nextInt();
		switch(Choice) {
		case 1:
			addStudent(array);
			break;
		case 2:
			showStudent(array);
			break;
		case 3:
			deleteStudent(array);
			break;
		case 4:
			updateStudent(array);
			break;
		case 5:
			Write(array);
			break;
		case 6:
		    Reader(array);
		    break;
		case 7:
			Search(array);
			break;
		default:
			break;	
		}
		}
	}
	private static void Search(ArrayList<Student> array) {
		// TODO 自动生成的方法存根
		int flag=0;
		System.out.println("请输入你要查找的学号");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(Student i:array) {
			if(i.getId().equals(s)) {
				flag=1;
				System.out.println("查找成功");
				System.out.println("学生ID:"+i.getId()+"  姓名:"+i.getName()+"  Age:"+i.getAge());
			}
		}
		if(flag==0) {
			System.out.println("查找失败");
		}
	}
	private static void Reader(ArrayList<Student> array) {
		// TODO 自动生成的方法存根
		try {
			BufferedReader br=new BufferedReader(new FileReader("d:\\Stu.txt"));
			String line;
			while((line=br.readLine())!=null) {
				String[] strLine=line.split(" ");
				Student s=new Student(strLine[0],strLine[1],strLine[2]);
				array.add(s);
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public static void addStudent(ArrayList<Student> array) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入学生ID");
		String s1=sc.nextLine();
		System.out.println("输入学生Name");
		String s2=sc.nextLine();
		System.out.println("输入学生Age");
		String s3=sc.nextLine();
		Student s=new Student(s1,s2,s3);
		array.add(s);
		System.out.println("添加成功");
	}
	public static void showStudent(ArrayList<Student> array) {
		for(int i=0;i<array.size();i++) {
			Student s=array.get(i);
			System.out.println("学生ID:"+s.getId()+"  姓名:"+s.getName()+"  Age:"+s.getAge());
		}
		System.out.println("total students:"+Student.count);
	}
	public static void deleteStudent(ArrayList<Student> array) {
		System.out.println("输入你想要删除的学生ID");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int m=0;
		for(int i=0;i<array.size();i++) {
			Student stu=array.get(i);
			if(stu.getId().equals(s)) {
					array.remove(i);
					m=1;
					System.out.println("delete successfully");
			}
		}
		if(m==0)
			System.out.println("无相关学生信息");
		
	}
	public static void updateStudent(ArrayList<Student> array) {
		System.out.println("输入你想要修改的学生ID");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int m=0;
		for(int i=0;i<array.size();i++) {
			Student stu=array.get(i);
			if(s.equals(stu.getId())) {
				System.out.println("输入学生新ID");
				String s1=sc.nextLine();
			    stu.setId(s1);
			    array.set(i,stu);
			    m=1;
			    System.out.println("update successfully");
			}			
		}
		if(m==0)
			System.out.println("无相关学生信息");
	}
	public static void Write(ArrayList<Student> array) {
		try {
			FileWriter fw=new FileWriter("d:\\Stu.txt");
			for(int i=0;i<array.size();i++) {
				Student s=array.get(i);
				fw.write(s.getId()+" "+s.getName()+" "+s.getAge());
				fw.write("\r\n");
				fw.flush();
			}
			fw.close();
			System.out.println("save successfully");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
