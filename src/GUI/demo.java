package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Border;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class demo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO �Զ����ɵķ������
		GridPane flp=new GridPane();
		TextArea text=new TextArea();
		for(int i=0;i<9;i++) {
			Button btn=new Button("��ť"+i);
			btn.setOnAction(e->{
				text.appendText("������"+btn.getText());
				text.appendText("\n");
			});
			flp.add(btn,(i+1)%3, (i/3)+1);
		}
		flp.add(text, 4, 4);
		Scene scene=new Scene(flp);
		primaryStage.setTitle("��ť�¼�");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		new demo().launch(args);
	}

}
