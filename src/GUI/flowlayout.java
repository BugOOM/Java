package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class flowlayout extends JFrame {
	public static void main(String[] args) {
		new flowlayout(5);
	}
	JButton[] btns=new JButton[10];
	JPanel jp=new JPanel();
	JPanel jp1=new JPanel();
	flowlayout(int n){
		setName("流失布局管理器");
		setBounds(300,300,300,300);
		
		for(int i=0;i<n;i++) {
			btns[i]=new JButton(i+"");
			jp.add(btns[i]);
		}
		for(int i=5;i<10;i++) {
			btns[i]=new JButton(i+"");
			jp1.add(btns[i]);
		}
		add(jp,BorderLayout.SOUTH);
		add(jp1,BorderLayout.NORTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

