package Test;



import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Requests extends Application {
	
	
	public void start(Stage stage)
	{
		
		Button leave = new Button("Leave Requests");
		leave.setPrefSize(150, 20);
		Button join = new Button("Join Requests");
		join.setPrefSize(150, 20);
		Button back = new Button("Back");
		back.setPrefSize(150, 20);
		
		Label vspace = new Label("");		
		VBox v = new VBox(20);	
		v.getChildren().addAll(leave,join,back);
		
		
		VBox v1 = new VBox(200);
		v1.getChildren().addAll(vspace,v);
		
		Label hspace = new Label("");
		
		HBox h = new HBox(250);
		h.getChildren().addAll(hspace,v1);
		
		
		Image image = new Image("file:Management.jpg");
		ImageView iv = new ImageView(image);
		
		Group g = new Group();
		g.getChildren().addAll(iv,h);
		
		Scene scene = new Scene(g,700,500);
		stage.setScene(scene);
		stage.show();
		
		back.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
		AssignTask a = new AssignTask();
		try {
			a.start(stage);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			}
		});
		
		leave.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
		ReqLeave r = new ReqLeave();
		try {
			r.start(stage);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
		});
		join.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				ReqJoin r = new ReqJoin();
				try {
					r.start(stage);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch(args);
	}

}
