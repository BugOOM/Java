package javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class demo4 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		FlowPane pane=new FlowPane();
		pane.setPadding(new Insets(11,12,13,14));
		pane.setHgap(5);
		pane.setVgap(5);
		pane.getChildren().addAll(new Label("First Name:"),new TextField(),new Label("MI:"));
		TextField tfmi=new TextField();
		tfmi.setPrefColumnCount(1);
		pane.getChildren().addAll(tfmi,new Label("Last Name"),new TextField());
		Scene scene=new Scene(pane,200,200);
		primaryStage.setTitle("FlowLayout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
