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
		// TODO �Զ����ɵķ������
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO �Զ����ɵķ������
		((Frame)e.getComponent()).dispose();
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}
	
}
