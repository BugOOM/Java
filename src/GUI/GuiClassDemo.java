package GUI;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GuiClassDemo {
	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setBounds(500,500,500,500);
		frame.setTitle("AWT组建常用使用实例");
		frame.setLayout(null);
		Label label=new Label("AWt各个组建");
		frame.add(label);
		Checkbox cbx1=new Checkbox("睡觉",true);
		cbx1.setBounds(10,30,50,30);
		Checkbox cbx2=new Checkbox("CS",false);
		cbx2.setBounds(70,30,50,30);
		Checkbox cbx3=new Checkbox("运动",false);
		cbx3.setBounds(120,30,50,30);
		frame.add(cbx1);
		frame.add(cbx2);
		frame.add(cbx3);
		CheckboxGroup cbxGroup=new CheckboxGroup();
		Checkbox cbx4=new Checkbox("男",true,cbxGroup);
		cbx4.setBounds(10,60,50,25);
		Checkbox cbx5=new Checkbox("女",false,cbxGroup);
		cbx5.setBounds(60,60,50,25);
		Checkbox cbx6=new Checkbox("保密",false,cbxGroup);
		cbx6.setBounds(120,60,50,25);
		frame.add(cbx4);
		frame.add(cbx5);
		frame.add(cbx6);
		Choice coe=new Choice();
		coe.setBounds(10,90,120,25);
		coe.add("大专");
		coe.add("本科");
		coe.add("其他");
		coe.select(2);
		frame.add(coe);
		Button btn=new Button("你点了我");
		frame.add(btn);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				FileDialog dialog=new FileDialog(new Frame(),"open...",FileDialog.LOAD);
				dialog.setVisible(true);
				String dir=dialog.getDirectory();
				String str=dialog.getFile();
				System.out.println("选择的文件是"+dir+str);
			}
			
		});
		Label labell=new Label("你的姓名");
		labell.setBounds(10,150,50,25);
		frame.add(labell);
		final TextField txt=new TextField();
		txt.setBounds(70,180,80,50);
		frame.add(txt);
		List list=new List(3,true);
		list.setBounds(10,180,80,50);
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		frame.add(list);
		Scrollbar sco=new Scrollbar(Scrollbar.HORIZONTAL,10,1,0,255);
		sco.addAdjustmentListener(new AdjustmentListener() {

			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				// TODO 自动生成的方法存根
				Scrollbar s=(Scrollbar)e.getSource();
				txt.setText(s.getValue()+" ");
			}
		});
		frame.add(sco);
		TextArea area=new TextArea(" ",5,50,TextArea.SCROLLBARS_BOTH);
		frame.add(area);
		area.setBounds(10,300,200,80);
		frame.add(area);
		frame.setResizable(false);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				((Frame)arg0.getSource()).dispose();
			}
		});
		frame.setVisible(true);
	}
	
}
