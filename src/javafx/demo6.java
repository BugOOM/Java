package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class demo6 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		Pane pane=new Pane();
		for(int i=0;i<16;i++) {
			Ellipse e=new Ellipse(150,100,100,50);
			e.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			e.setFill(Color.WHITE);
			e.setRotate(i*180/16);
			pane.getChildren().add(e);
		}
		Scene scene=new Scene(pane,300,300);
		primaryStage.setTitle("椭圆");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		new demo6().launch(args);
	}

}
