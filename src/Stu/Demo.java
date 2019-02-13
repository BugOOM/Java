package Stu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * �����ҵ�ѧ������ϵͳ������
 * 
 * �������£�
 * A:����ѧ����
 * B:ѧ������ϵͳ��������Ĵ����д
 * C:ѧ������ϵͳ�Ĳ鿴����ѧ���Ĵ����д
 * D:ѧ������ϵͳ�����ѧ���Ĵ����д
 * E:ѧ������ϵͳ��ɾ��ѧ���Ĵ����д
 * F:ѧ������ϵͳ���޸�ѧ���Ĵ����д
 */
public class Demo{
	public static void main(String[] args) {
		//�������϶������ڴ洢ѧ������
		ArrayList<Student> array=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("���������ѡ��");
		System.out.println("1 ���ѧ��");
		System.out.println("2 ��ʾ����ѧ����Ϣ");
		System.out.println("3 ɾ��ѧ��");
		System.out.println("4 updateѧ��");
		System.out.println("5 ���浽�ļ�");
		System.out.println("6 ���ļ���ȡ");
		System.out.println("7 ��ѯ");
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
		// TODO �Զ����ɵķ������
		int flag=0;
		System.out.println("��������Ҫ���ҵ�ѧ��");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(Student i:array) {
			if(i.getId().equals(s)) {
				flag=1;
				System.out.println("���ҳɹ�");
				System.out.println("ѧ��ID:"+i.getId()+"  ����:"+i.getName()+"  Age:"+i.getAge());
			}
		}
		if(flag==0) {
			System.out.println("����ʧ��");
		}
	}
	private static void Reader(ArrayList<Student> array) {
		// TODO �Զ����ɵķ������
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public static void addStudent(ArrayList<Student> array) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����ѧ��ID");
		String s1=sc.nextLine();
		System.out.println("����ѧ��Name");
		String s2=sc.nextLine();
		System.out.println("����ѧ��Age");
		String s3=sc.nextLine();
		Student s=new Student(s1,s2,s3);
		array.add(s);
		System.out.println("��ӳɹ�");
	}
	public static void showStudent(ArrayList<Student> array) {
		for(int i=0;i<array.size();i++) {
			Student s=array.get(i);
			System.out.println("ѧ��ID:"+s.getId()+"  ����:"+s.getName()+"  Age:"+s.getAge());
		}
		System.out.println("total students:"+Student.count);
	}
	public static void deleteStudent(ArrayList<Student> array) {
		System.out.println("��������Ҫɾ����ѧ��ID");
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
			System.out.println("�����ѧ����Ϣ");
		
	}
	public static void updateStudent(ArrayList<Student> array) {
		System.out.println("��������Ҫ�޸ĵ�ѧ��ID");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int m=0;
		for(int i=0;i<array.size();i++) {
			Student stu=array.get(i);
			if(s.equals(stu.getId())) {
				System.out.println("����ѧ����ID");
				String s1=sc.nextLine();
			    stu.setId(s1);
			    array.set(i,stu);
			    m=1;
			    System.out.println("update successfully");
			}			
		}
		if(m==0)
			System.out.println("�����ѧ����Ϣ");
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
