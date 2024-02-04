package Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AdminLogIn extends Application {

	public void start(Stage stage) throws Exception
	{
		

		
		
		Button Assingtask = new Button("AssignTask");
		Assingtask.setPrefSize(120, 20);
		
		Button Viewattendance = new Button("View Attendance");
		Viewattendance.setPrefSize(120, 20);
		
		Button Addemployee = new Button("Add Employee");
		Addemployee.setPrefSize(120, 20);
		
		Button Removeemployee = new Button("Remove Employee");
		Removeemployee.setPrefSize(120, 20);
		
		Label space1 = new Label(" ");
		
		VBox v1 = new VBox(80);
		v1.getChildren().addAll(space1,Assingtask,Viewattendance,Addemployee,Removeemployee);
		
		Label hhspace = new Label("");
		
		HBox hhh = new HBox(10);
		hhh.getChildren().addAll(hhspace,v1);
		
		Button Searchemployee = new Button("Search Employee");
		Searchemployee.setPrefSize(120, 20);
		
		Button Taskfeedback = new Button("Task FeedBack");
		Taskfeedback.setPrefSize(120, 20);
		
		Button Deadline = new Button("Deadline");
		Deadline.setPrefSize(120, 20);
		
		Button Myprofile = new Button("My Profile");
		Myprofile.setPrefSize(120, 20);
		
		Label space3 = new Label(" ");
	
		VBox v2 = new VBox(80);
		v2.getChildren().addAll(space3,Searchemployee,Taskfeedback,Deadline,Myprofile);
		
	
		
		Button SignOut = new Button("SignOut");
		SignOut.setPrefSize(120, 20);
		
		Label space = new Label("Weclome Admin ");
		space.setTextFill(Color.BLACK);
		
		VBox v3 = new VBox(400);
		v3.getChildren().addAll(space,SignOut);
		
		HBox h = new HBox(170);
		h.getChildren().addAll(hhh,v3,v2);
		
		
		Image image = new Image("file:HR1.jpg");
		ImageView iv = new ImageView(image);
		
		Group g = new Group();
		g.getChildren().addAll(iv,h);
		Scene scene = new Scene(g,700,500);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
		
		
	Myprofile.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			MyProfileAdmin a = new MyProfileAdmin();
			try {
				a.start(stage);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});	
		
	Assingtask.setOnAction(new EventHandler<ActionEvent>() {
		
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
	Addemployee.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			AddEmployee a = new AddEmployee();
			a.start(stage);
		}
	});
	SignOut.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			AddingImage a = new AddingImage();
			try {
				a.start(stage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
		
		Searchemployee.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				EmployeeSearch a = new EmployeeSearch();
				a.start(stage);
				
			}
		});
		
		Removeemployee.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
		DeleteEmployee d = new DeleteEmployee();
		try {
			d.start(stage);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			}
		});
		
		Viewattendance.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				viewAttendance v = new viewAttendance();
				try {
					v.start(stage);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Taskfeedback.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				FeedBack f =  new FeedBack();
				try {
					f.start(stage);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		Deadline.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
		DeadlineOfTask d = new DeadlineOfTask();
		d.start(stage);
			}
		});
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch(args);
	}

}
