package GUI;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class checkbox extends JFrame{
		public static void main(String[] args) {
			new checkbox("my checkbox");
		}
		JCheckBox t1=new JCheckBox("visual c++");
		JCheckBox t2=new JCheckBox("���ݽṹ");
		JCheckBox t3=new JCheckBox("Java");
		ButtonGroup bg=new ButtonGroup();
		JRadioButton r1=new JRadioButton("����");
		JRadioButton r2=new JRadioButton("�о���");
		JRadioButton r3=new JRadioButton("��ʿ");
		JRadioButton r4=new JRadioButton("ר��");
		JLabel lb1=new JLabel("�㾫ͨ�����Ե��ǣ�");
		JLabel lb2=new JLabel("���ѧ����:");
		checkbox(String str){
			setTitle(str);
			setBounds(400,400,400,400);
			setLayout(new FlowLayout());
			bg.add(r1);
			bg.add(r2);
			bg.add(r3);
			bg.add(r4);
			add(lb1);
			add(t1);
			add(t2);
			add(t3);
			add(lb2);
			add(r1);
			add(r2);
			add(r3);
			add(r4);
			setVisible(true);
			
			
		}
		
}
