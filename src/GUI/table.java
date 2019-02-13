package GUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class table extends JFrame{
	public static void main(String[] args) {
		new table();
	}
	JTable jtable;
	String[][] cells={
		{"PTQ","China_HenNan","023-1234567","2009-10","3100"},
		{"DZY","China_LioaNing","024-1234567","2008-10","3101"},
		{"YP","China_ShanXi","026-1234567","20010-10","3102"}
	};
	String[] Column= {"name","place","call","date","salary"};
	table(){
		setTitle("±í¸ñ");
		setSize(500,300);
		jtable=new JTable(cells,Column);
		add(jtable.getTableHeader(),BorderLayout.NORTH);
		add(jtable,BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
