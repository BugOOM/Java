package GUI;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class javafx extends Application {
    private TextField tf = new TextField();
    private Button btC =new Button("C");
    private Button btT =new Button("←");
    private  Button bt0 =new Button("0");
    private   Button bt1 =new Button("1");
    private  Button bt2 =new Button("2");
    private  Button bt3 =new Button("3");
    private  Button bt4 =new Button("4");
    private  Button bt5 =new Button("5");
    private  Button bt6 =new Button("6");
    private  Button bt7 =new Button("7");
    private  Button bt8 =new Button("8");
    private  Button bt9 =new Button("9");
    private   Button btadd =new Button("+");
    private   Button btsub =new Button("-");
    private   Button btmul =new Button("*");
    private   Button btdiv =new Button("/");
    private  Button btdot =new Button(".");
    private  Button btSum =new Button("=");
	private String s = "",t = "";
    
	@Override
	public void start(Stage primaryStage) {
		
		tf.setAlignment(Pos.BASELINE_RIGHT);
		tf.setMaxWidth(47);
		
		HBox hb = new HBox(5);
		hb.getChildren().addAll(tf,btC,btT);
		hb.setAlignment(Pos.CENTER);
		
		GridPane gpan = new GridPane();
		gpan.setAlignment(Pos.CENTER);
		gpan.setHgap(4);
		gpan.setVgap(4);
		
		gpan.add(bt7, 0, 0);
		gpan.add(bt8, 1, 0);
		gpan.add(bt9, 2, 0);
		gpan.add(btdiv, 3, 0);
		gpan.add(bt4, 0, 1);
		gpan.add(bt5, 1, 1);
		gpan.add(bt6, 2, 1);
		gpan.add(btmul, 3, 1);
		gpan.add(bt1, 0, 2);
		gpan.add(bt2, 1, 2);
		gpan.add(bt3, 2, 2);
		gpan.add(btsub, 3, 2);
		gpan.add(btdot, 0, 3);
		gpan.add(bt0, 1, 3);
		gpan.add(btSum, 2, 3);
		gpan.add(btadd, 3, 3);
		
	/*	BorderPane bpane = new BorderPane();
		bpane.setTop(hb);
		bpane.setCenter(gpan);*/
		
		VBox vb = new VBox(5);
		vb.getChildren().addAll(hb,gpan);
		vb.setAlignment(Pos.CENTER);
		
		bt0.setOnAction(e ->{
			if(s.charAt(s.length()-1) == '/') {
				tf.setText("不能除以0");
				s+="0";
			}else if(s.charAt(s.length()-1) != '/') {
				s+="0";
				tf.setText(s);
			}
		});
		bt1.setOnAction(e ->{
			s+="1";
			tf.setText(s);
		});
		bt2.setOnAction(e ->{
			s+="2";
			tf.setText(s);
		});
		bt3.setOnAction(e ->{
			s+="3";
			tf.setText(s);
		});
		bt4.setOnAction(e ->{
			s+="4";
			tf.setText(s);
		});
		bt5.setOnAction(e ->{
			s+="5";
			tf.setText(s);
		});
		bt6.setOnAction(e ->{
			s+="6";
			tf.setText(s);
		});
		bt7.setOnAction(e ->{
			s+="7";
			tf.setText(s);
		});
		bt8.setOnAction(e ->{
			s+="8";
			tf.setText(s);
		});
		bt9.setOnAction(e ->{
			s+="9";
			tf.setText(s);
		});
		btdot.setOnAction(e ->{
			s+=".";
			tf.setText(s);
		});
		btadd.setOnAction(e ->{
			if(s.length() == 0) {
				s = "";//第一次按加号不设置！
			}else{
				t+=s.charAt(s.length()-1);
				if(t.matches("[+-/*]")) 
					s = s.substring(0,s.length()-1);
				s+="+";
				t = "";
			}
			tf.setText(s);
		});
		btsub.setOnAction(e ->{
			if(s.length() == 0) {
				s+="-";
			}else{
				t+=s.charAt(s.length()-1);
				if(t.matches("[+-/*]")) 
					s = s.substring(0,s.length()-1);
				s+="-";
				t = "";
			}
			tf.setText(s);
		});
		btmul.setOnAction(e ->{
			if(s.length() == 0) {
				s = "";//第一次按加号不设置！
			}else{
				t+=s.charAt(s.length()-1);
				if(t.matches("[+-/*]")) 
					s = s.substring(0,s.length()-1);
				s+="*";
				t = "";
			}
			tf.setText(s);
		});
		btdiv.setOnAction(e ->{
			if(s.length() == 0) {
				s = "";//第一次按加号不设置！
			}else{
				t+=s.charAt(s.length()-1);
				if(t.matches("[+-/*]")) 
					s = s.substring(0,s.length()-1);
				s+="/";
				t = "";
			}
			tf.setText(s);
		});
		btSum.setOnAction(e ->{
            if(tf.getText().equals("不能除以0")) {
            	tf.setText("不能除以0");
            }else {
            	double sum = calculate(tf.getText());
                if(sum%1 == 0) {
                	tf.setText(String.valueOf((int)sum));
                	s = String.valueOf((int)sum);
                }else {
                	tf.setText(String.valueOf(sum));
                	s = String.valueOf(sum);
                }
            }
            
		});
		btC.setOnAction(e ->{
			s = "";
			tf.setText(s);
		});
		btT.setOnAction(e ->{
			if(s.length()!= 0)
			    s = s.substring(0,s.length()-1);
			else
				s = "";
			tf.setText(s);
		});
		
		
		
		Scene scene = new Scene(vb);
		primaryStage.setTitle("简单计算器");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public static double calculate(String tf) {
		String sBegin = tf;
		String ts = "";
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0;i<sBegin.length();i++) {
			ts = sBegin.charAt(i)+ts;
			list.add(ts);
			ts = "";
		}//把s复制给list
		for(int i = 0;i<list.size();i++) {
			if(list.get(i).matches("[/*]")) {//list.get(i).equals("/") || list.get(i).equals("*")
				int a = i,b = i;
				
				while(!list.get(a).matches("[+-]")) {
					a--;
					if(a == 0)
						break;
				}
				if(a == 0)
					list.add(0, "(");
				else
					list.add(a+1,"(");
				
				b++;
				while(b != list.size()) {
					if(list.get(b-1).matches("[/*]")&&list.get(b).equals("-")){
						b++;
						continue;
					}
					if(list.get(b).matches("[+-]"))
	                	break;
	                b++;
				}
				if(b == list.size())
					list.add(list.size(), ")");
				else
					list.add(b,")");
				i = b;
			}
		}
		
		for(int i = 0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
	
		String s = "";
    	for(int i = 0;i<list.size();i++) {
			s+=list.get(i);
		}//把list复制给s1
		
		//开始计算
		double result = 0,tnum = 0;
		char operator = ' ';
		String tt = "",_s="";
		for(int i = 0;i<s.length();i++) {
			tt +=s.charAt(i);//把字符改成字符串类型,tt就是算法中的是s[i]
			if(i!= 0 && (tt.equals("+") ||tt.equals("-") )) {
				//加i!=0的作用是为了防止第一个数是负数。
				_s = s.substring(0, i);
				tnum = Double.parseDouble(_s);
		    }else if(tt.equals("(")){
				int j = i+1;
				char ttt = ' ';//找到右括号，截取s片段
				ttt = s.charAt(j);
				String s1 = "";
				while(ttt != ')'){
					s1 += ttt;
					j++;
					ttt = s.charAt(j);
				}
				tnum = getNum(s1);
				i = j+1;
			}else if(s.matches("^\\d+(\\.\\d+)?$")) {//非负浮点数包括非负整数
				_s = s;
				tnum = Double.parseDouble(_s);
				s = "";
			}
			
			if(operator == ' ')
				result  = tnum;
			if(operator == '+')
				result += tnum;
			if(operator == '-')
		    	result -= tnum;
	
			if(i == s.length())
				break;
			
			if(s.charAt(i)== '+'||s.charAt(i)== '-') { //s.charAt(i)== '+'||s.charAt(i)== '-'
				operator = s.charAt(i);
			    s = s.substring(i+1);
			    i = -1;
			    tnum = 0;
			}
			tt = "";	
		}
		return result;
	}
      

	
	public static double getNum(String s) {
		double result1 = 0;
		double tnum = 1.0;
		char operator = ' ';
		String tt = "",_s = "";
		for(int i = 0;i<s.length();i++) {
			tt +=s.charAt(i);//把字符改成字符串类型,tt就是算法中的是s[i]
			if(tt.matches("[/*]")) {
				_s = s.substring(0, i);
				tnum = Double.parseDouble(_s);
			}else if(s.matches("^(-?\\d+)(\\.\\d+)?$")) {//所有数字，无论正数负数
				_s = s;
				tnum = Double.parseDouble(_s);
				s = "";
			}
			
			if(operator == ' ')
				result1 = tnum;
			if(operator == '/')
				result1 /= tnum;
			if(operator == '*')
				result1 *= tnum;
			
			if(tt.matches("[/*]")) {
				operator = s.charAt(i);
			    s = s.substring(i+1);
			    tnum = 1.0;
			    i = -1;
			}
			tt = "";
		}
		return result1;
	}

}

