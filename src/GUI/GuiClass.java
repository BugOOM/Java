 package GUI;

 import java.awt.Button;
 import java.awt.event.WindowEvent;
 import java.awt.event.WindowListener;
 import java.awt.Color;
 import java.awt.FlowLayout;
 import java.awt.Frame;
 import java.awt.Panel;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 
public class GuiClass implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 自动生成的方法存根
		((Frame)e.getComponent()).dispose();
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}
	
}
