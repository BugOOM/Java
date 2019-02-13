package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class sWing extends JFrame implements ActionListener{
	JTextField txtUserName;
	JButton btn1=new JButton("btn1");
	JButton btn2=new JButton("btn2");
	sWing(String title){
		setTitle(title);
		setBounds(500,500,500,500);
		setLayout(new FlowLayout());
		txtUserName=new JTextField(12);
		add(txtUserName);
		add(btn1);
		add(btn2);
		btn1.addActionListener(this); 
		btn2.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if(e.getSource()==btn1)
			txtUserName.setText("你点击了"+btn1.getText());
		else
			txtUserName.setText("你点击了"+btn2.getText());
	}
	
}
