package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AssignTask extends Application{

	

	
	public void start(Stage stage) throws FileNotFoundException


	{
		String file = "Names.txt";
		
		FileReader f = new FileReader(file);
		Scanner s = new Scanner(f);
		
		VBox vv =new VBox(20);
		
		while(s.hasNext())
		{
			
		
		Text Assign = new Text("Select Team");
		CheckBox c1 = new CheckBox(s.next());
		c1.setAlignment(Pos.CENTER);
		CheckBox c2 = new CheckBox(s.next());
		CheckBox c3 = new CheckBox(s.next());
		CheckBox c4 = new CheckBox(s.next());
		CheckBox c5 = new CheckBox(s.next());
		vv.getChildren().addAll(Assign,c1,c2,c3,c4,c5);
		
		}
		TextField message = new TextField("Please Enter Your Message Here");
		message.setPrefSize(100, 100);
		
		Text Vspace = new Text(" ");
		
		Button viewRequests = new Button("View Requests");
		viewRequests.setPrefSize(220, 20);
		
		
		
		Button submit = new Button("Submit");
		submit.setPrefSize(100, 20);
		Button cancel = new Button("Cancel");
		cancel.setPrefSize(100, 20);
		HBox h1 = new HBox(20);
		h1.getChildren().addAll(submit,cancel);
		
		VBox v1 = new VBox(20);
		v1.getChildren().addAll(Vspace,vv,message,h1,viewRequests);
		
		Text Hspace = new Text(" ");
		
		HBox h2 = new HBox(250);
		h2.getChildren().addAll(Hspace,v1);
		
		
		Image image = new Image("file:assignTask.jpg");
		ImageView iv = new ImageView(image);
		Group g = new Group();
		
		g.getChildren().addAll(iv,h2);

		
				Scene scene =new Scene(g,700,500);
				stage.setScene(scene);
				stage.setResizable(false);
				stage.show();
	
				submit.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
						
						String details= "";
						
						details = message.getText() ;
						
					ConnectionFile cnn = new ConnectionFile();
					try{
						
						cnn.AssignTaskFile(details);
						
						Alert a = new Alert(AlertType.INFORMATION);
						a.setContentText("Task Has been Assigned");
						a.showAndWait();
						if(a.getResult() == ButtonType.OK)
						{
							message.setText(null);
							
						}
					}
					catch(IOException e)
					{
						e.printStackTrace();
					}
						
					}
				});
				
				viewRequests.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
				
						Requests r = new Requests();
						r.start(stage);
						
						
					}
				});
				
				cancel.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						AdminLogIn a = new AdminLogIn();
						try {
							a.start(stage);
						} catch (Exception e) {
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
