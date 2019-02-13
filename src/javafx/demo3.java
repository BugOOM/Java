package javafx;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class demo3 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		Pane pane=new HBox(10);
		pane.setPadding(new Insets(5,5,5,5));
		Image image=new Image("D:\\321.jpg");
		pane.getChildren().add(new ImageView(image));
		ImageView imageview=new ImageView(image);
		imageview.setFitHeight(100);
		imageview.setFitWidth(100);
		pane.getChildren().add(imageview);
		Scene scene=new Scene(pane);
		primaryStage.setTitle("Show Image");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
