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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class EmployeeViewTask extends Application
{

	
	public void start(Stage stage)throws IOException
	{
		
try{
		File file = new File("AssignedTask.txt");
		Scanner s = new Scanner(file);
		Label Heading =  new Label(" Assigned Task By Admin");
		Heading.setFont(Font.font(30));
		TextField l = new TextField(s.nextLine());
		l.setPrefSize(400, 300);
		
		Label bspace = new Label(" ");
		
		
		Button back = new Button("Back");
		back.setPrefSize(120, 20);
		
		HBox h3 = new HBox(150);
		h3.getChildren().addAll(bspace,back);
		
		VBox v = new VBox(20);
		v.getChildren().addAll(Heading,l,h3);
		Label text = new Label(" ");
		
		HBox h1 =new HBox(160);
		h1.getChildren().addAll(text,v);
		
		Label vspace = new Label("");
		
		VBox v2  = new VBox(30);
		v2.getChildren().addAll(vspace,h1);
		


		
		Scene scene = new Scene(v2,700,500);
		stage.setScene(scene);
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
