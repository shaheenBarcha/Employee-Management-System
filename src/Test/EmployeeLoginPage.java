package Test;



import java.io.FileNotFoundException;
import java.io.IOException;

import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EmployeeLoginPage extends Application {
	
	public void start(Stage stage) throws IOException
	{
		try{
		Button viewTask =  new Button("View Task");
		viewTask.setPrefSize(150, 20);

		Button updateTask =  new Button("Update Task");
		updateTask.setPrefSize(150, 20);
		
		Button joinRequest = new Button("Request to Join Team");
		joinRequest.setPrefSize(150, 20);
		
		Text v1space= new Text("");
		
		VBox v1 = new VBox(100);
		v1.getChildren().addAll(v1space,viewTask,updateTask,joinRequest);
		
		Button viewDeadline = new Button("View Deadline");
		viewDeadline.setPrefSize(150, 20);
		
		Button myProfile = new Button("My profile");
		myProfile.setPrefSize(150, 20);
		
		Button ReqLeave = new Button("Request to Leave Team");
		
		ReqLeave.setPrefSize(150, 20);
		
		Button LogOut = new Button("Logout");
		LogOut.setPrefSize(120, 20);
		Text v3space = new Text("Welcome Sir");
		v3space.setFont(Font.font(30));
	
		
		VBox v3 = new VBox(400);
		v3.getChildren().addAll(v3space,LogOut);
		
		
		Text v2space = new  Text("");
		
		VBox v2 = new VBox(100);
		v2.getChildren().addAll(v2space,viewDeadline ,myProfile,ReqLeave);
		
		HBox h1 =  new HBox(50);
		h1.getChildren().addAll(v1,v3,v2);
		
		
		Image image  = new Image("file:Emplog.jpg");
		ImageView iv = new ImageView(image);

		Group g = new Group();
		g.getChildren().addAll(iv,h1);
		
		Scene scene = new Scene(g,700,500);
		stage.setScene(scene);
		stage.show();
		
		
		viewTask.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				EmployeeViewTask e = new EmployeeViewTask();
				try {
					e.start(stage);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		myProfile.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
		
				MyProfileEmployee m = new MyProfileEmployee();
				try {
					m.start(stage);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		
	
		
		
		joinRequest.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
		
				RequestToJoin a = new RequestToJoin();
				a.start(stage);
				
			}
		});
		ReqLeave.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				RequestToleave a = new RequestToleave();
				try {
					a.start(stage);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		updateTask.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
		
				TaskUpdateEmployee a = new TaskUpdateEmployee();
				try {
					a.start(stage);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		viewDeadline.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				ViewDeadline a = new ViewDeadline();
				try {
					a.start(stage);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		LogOut.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
		
				AddingImage a =  new AddingImage();
				try {
					a.start(stage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch(args);

	}

}
