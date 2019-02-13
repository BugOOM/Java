package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.synth.SynthStyle;

public class JSQ extends JFrame implements ActionListener{
	int Len=20;
	JButton[] btns= {new JButton("7"),new JButton("8"),new JButton("9"),new JButton("+"),
			new JButton("4"),new JButton("5"),new JButton("6"),new JButton("-"),
			new JButton("1"),new JButton("2"),new JButton("3"),new JButton("*"),
			 new JButton("<"),new JButton("0"),new JButton("/"),new JButton("=")};
	JTextArea txt=new JTextArea(1,15);
	int[] integer=new int[Len];
	char[] chs=new char[Len];
	int m=0;
	int n=0;
	int count=0;
	int count1=0;
	JSQ(String title){
		for(int t=0;t<Len;t++) {
			integer[t]=0;
			chs[t]='.';
		}
		setTitle(title);
		setBounds(500,500,220,220);
		setLayout(new FlowLayout());
		add(txt);
		for(JButton i:btns) {
			add(i);
			i.addActionListener(this);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public int JC(int y) {
		int i=1;
		int sum=1;
		while(i<=y) {
			sum*=10;
			i++;
		}
		return sum;
	}
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存
		for(int j=0;j<btns.length;j++) {
			
			if(e.getSource()==btns[j]) {
				txt.append(btns[j].getText());
				if(j==0||j==1||j==2) {
					integer[m]=j+7;m++;
				}
				if(j==4||j==5||j==6) {
					integer[m]=j;m++;
				}
				if(j==8||j==9||j==10) {
					integer[m]=j-7;m++;
				}
				if(j==13) {
					integer[m]=0;m++;
				}
				if(j==3) {
					chs[n]='+';n++;
				}
				if(j==7) {
					chs[n]='-';n++;
				}
				if(j==11) { 
					chs[n]='*';n++;
				}
				if(j==14) {
					chs[n]='/';n++;
				}
				if(j==15) {
					chs[n]='=';n++;
				}
				if(j==12) {
					chs[n]='<';n++;
				}
				if(n==0)
					count++;
				if(n==1)
					count1++;
				
				break;
			}
		}
		double sum=0;
		double sum1=0;
		for(int s=count;s>0;s--) {
			sum+=JC(s-1)*integer[count-s];
		}
		for(int r=count1;r>0;r--) {
			sum1+=JC(r-2)*integer[count+count1-r];
		}
		
		if((chs[0]=='+')&&(chs[1]=='='))
		    txt.append((sum+sum1)+"");
		if(chs[0]=='-'&&chs[1]=='=')
			txt.append((sum-sum1)+"");
		if(chs[0]=='*'&&chs[1]=='=')
			txt.append((sum*sum1)+"");
		if(chs[0]=='/'&&chs[1]=='=')
		    txt.append(((float)sum/sum1)+"");
		if(chs[0]=='<'||chs[1]=='<'||chs[2]=='<') {
			txt.setText(null);
			m=0;
			n=0;
			for(int t=0;t<Len;t++) {
				integer[t]=0;
				chs[t]='.';
			}
		}
	}	
	  
	
	public static void main(String[] args) {
		new JSQ("my jsq");
	}
	
}
