package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TaskUpdateEmployee extends Application
{

	
	public void start(Stage stage)throws IOException
	{
		
try{
		File file = new File("AssignedTask.txt");
		
		Scanner s = new Scanner(file);
		
		Label Id = new Label("Enter your ID and Name ");
		
		TextField IDF = new TextField();

		IDF.setPrefSize(310, 20);
		
		HBox h = new HBox(20);
		h.getChildren().addAll(Id,IDF);
		
		TextField l = new TextField(s.nextLine());
		l.setPrefSize(400, 300);
		
		Label bspace = new Label(" ");
		
		Button Submit = new Button("Submit");
		Submit.setPrefSize(150, 20);
		
		Button back = new Button("Back");
		back.setPrefSize(150, 20);
		
		HBox h3 = new HBox(100);
		h3.getChildren().addAll(Submit,back);
		
		VBox v = new VBox(20);
		v.getChildren().addAll(h,l,h3);
		
		Label text = new Label(" ");
		
		HBox h1 =new HBox(160);
		h1.getChildren().addAll(text,v);
		
		Label vspace = new Label("");
		
		VBox v2  = new VBox(30);
		v2.getChildren().addAll(vspace,h1);
		
		Image image = new Image("file:updateTask.jpg");
		ImageView iv = new ImageView(image);
		
		Group g = new Group();
		g.getChildren().addAll(iv,v2);


		
		Scene scene = new Scene(g,700,500);
		stage.setScene(scene);
		
		stage.setResizable(false);
		stage.show();
		
		back.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				EmployeeLoginPage e = new EmployeeLoginPage();
				try {
					e.start(stage);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		Submit.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
		
				String details = "";
				details+= IDF.getText()+"\n";
				details+=l.getText();
				
				ConnectionFile cnn =new ConnectionFile();
				
				try {
					cnn.writeintofeedback(details);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				Alert a= new Alert(AlertType.INFORMATION);
				a.setContentText("Submitted Successfully");
				a.showAndWait();
				if(a.getResult()==ButtonType.OK)
				{
					IDF.setText(null);
					l.setText(null);
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
