package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class demo2 extends Application{

	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		Pane pane=new StackPane();
		Circle circle=new Circle();
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(new Color(0.5,0.5,0.5,0.1));
		pane.getChildren().add(circle);
		Label label=new Label("JavaFx");
		label.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
		pane.getChildren().add(label);
		Scene scene=new Scene(pane);
		primaryStage.setTitle("FontDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
