package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class birdlayout extends JFrame implements ActionListener{
public static void main(String[] args) {
		new birdlayout();
	}
	JButton[] btns;
	birdlayout(){
		setTitle("网格布局管理器");
		setBounds(300,300,300,300);
		String[] str= {"1","2","3","4","5","6","7","8","9"};
		btns=new JButton[str.length];
		setLayout(new GridLayout(3,3));
		for(int i=0;i<str.length;i++) {
			btns[i]=new JButton(i+"");
			add(btns[i]);
			btns[i].addActionListener(this);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		JButton jbt=(JButton) e.getSource();
		JDialog jd=new JDialog();
		JLabel jbl=new JLabel();
		jd.add(jbl);
		jbl.setText(jbt.getText());
		jd.setVisible(true);
		jd.setSize(100, 100);
	}
}

