package Stu;
/*
 * �����ҵ�ѧ����
 */
public class Student {
	//ѧ��
	//ѧ��
		private String id;
		//����
		private String name;
		//����
		private String age;
		//��ס��
		static int count=0;
		public Student() {
			
		}

		public Student(String id, String name, String age) {
			this.id = id;
			this.name = name;
			this.age = age;
			count++;
		
		}

		

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

	}
