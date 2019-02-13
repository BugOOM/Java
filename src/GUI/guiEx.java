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
	JTextArea jtx1=new JTextArea("文本区1  两行三列",2,30);
	JTextArea jtx2=new JTextArea("文本区2 ",3,30);
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
		jtx2.append("设定两行三列，创建并显示水瓶和垂直滚动条\n");
		jtx2.append("添加第二行\n");
		jtx2.append("添加第三行\n");
		jtx2.append("创建第四行\n");
		jtx2.setEnabled(true);
		js2=new JScrollPane(jtx2);
		js2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		js2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JButton btn=new JButton("计数按钮");
		btn.addActionListener(this);
		add(btn);
		add(js2);
		add(txt);
//		add(jps);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		count++;
		txt.setText("你点击了"+count+"次");
	}
}
