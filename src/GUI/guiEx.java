package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class guiEx extends JFrame implements ActionListener{
	public static void main(String[] args) {
		new guiEx("GUI");
	}
	int count;
	JTextField txt=new JTextField(10);
	JTextArea jtx1=new JTextArea("�ı���1  ��������",2,30);
	JTextArea jtx2=new JTextArea("�ı���2 ",3,30);
	JScrollPane js1;
	JScrollPane js2;
//	JPasswordField jps=new JPasswordField(10);
	guiEx(String title){
		count=0;
		setTitle(title);
		setBounds(500,500,500,500);
		setLayout(new FlowLayout());
		js1=new JScrollPane(jtx1);
//		add(new JLabel("first label"),JLabel.SOUTH);
		jtx1.setEditable(false);
		js1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		js1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		add(js1);
		jtx2.append("�趨�������У���������ʾˮƿ�ʹ�ֱ������\n");
		jtx2.append("��ӵڶ���\n");
		jtx2.append("��ӵ�����\n");
		jtx2.append("����������\n");
		jtx2.setEnabled(true);
		js2=new JScrollPane(jtx2);
		js2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		js2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JButton btn=new JButton("������ť");
		btn.addActionListener(this);
		add(btn);
		add(js2);
		add(txt);
//		add(jps);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		count++;
		txt.setText("������"+count+"��");
	}
}
