package ENUM;
//ö�ٿ���ʵ�ֽӿڣ�����ÿһ��ö�ٶ��󶼱���ʵ�����з���
//ö�ٿ��Զ�����󷽷�������ÿ��ö�ٶ��󶼱���ʵ��ÿ�����󷽷�
public enum demo2 implements show{
	EAST{

		@Override
		public String show() {
			// TODO �Զ����ɵķ������
			return "���Ƕ���";
		}
	},
	NORTH{

		@Override
		public String show() {
			// TODO �Զ����ɵķ������
			return "���Ǳ���";
		}
	},
	WEST{

		@Override
		public String show() {
			// TODO �Զ����ɵķ������
			return "��������";
		}
	},
	SOUTH{

		@Override
		public String show() {
			// TODO �Զ����ɵķ������
			return "�����ϲ�";
		}
	};
	
}
