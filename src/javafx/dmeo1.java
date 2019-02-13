package javafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class dmeo1 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		Circle circle=new Circle();
		StackPane pane=new StackPane();
		Button btn=new Button("OK");
		btn.setStyle("-fx-border-color:blue;");
		pane.setRotate(45);
		pane.setStyle("-fx-border-color:red,-fx-background-color:lightgray;");
		pane.getChildren().add(btn);
		Scene scene=new Scene(pane,300,500);
		primaryStage.setTitle("MyJavafx");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
