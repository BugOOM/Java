package javafx;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class demo5 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		GridPane pane=new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		pane.add(new Label("First name:"),0,0);
		pane.add(new TextField(), 1, 0);
		pane.add(new Label("MI:"), 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("Last Name:"), 0, 2);
		pane.add(new TextField(), 1, 2);
		Button btn=new Button("ADD name:");
		pane.add(btn, 1, 3);
		GridPane.setHalignment(btn, HPos.RIGHT);
		Scene scene=new Scene(pane);
		primaryStage.setTitle("GridLAyout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
