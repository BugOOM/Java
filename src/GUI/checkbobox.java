package GUI;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class checkbobox extends JFrame {
	public static void main(String[] args) {
		new checkbobox();
	}
	JComboBox jbx=new JComboBox();
	JLabel jbl=new JLabel("你喜欢的明星");
	checkbobox(){
		setTitle("明星列表");
		setBounds(400,400,400,400);
		setLayout(new FlowLayout());
		jbx.addItem("jordan");
		jbx.addItem("byrant");
		jbx.addItem("1234");
		add(jbx);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
}
