package Test;

import java.io.FileNotFoundException;

import java.io.FileReader;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;
 

public class EmployeeSearch extends Application{

	public void start(Stage stage)
	{
	Text tspace1 =new  Text(" ");
	
TextField searchf = new TextField("Enter ID Here");
searchf.setPrefSize(265, 20);

	
	HBox h2 = new HBox(250);
	h2.getChildren().addAll(tspace1,searchf);

Button Search = new Button("Search");
Search.setPrefSize(120, 20);
Text tspace = new Text(" ");
Button back = new Button("Back");
back.setPrefSize(120, 20);

HBox h3 = new HBox(20);
h3.getChildren().addAll(Search,back);

HBox h = new HBox(250);
h.getChildren().addAll(tspace,h3);

VBox v = new VBox(30);
v.getChildren().addAll(h2,h);

VBox v1 = new VBox();


VBox vspace = new VBox(100);
vspace.getChildren().addAll(v1,v);
	
Image image = new Image("file:Search.jpg");
ImageView iv = new ImageView(image);

Group g = new Group();
g.getChildren().addAll(iv,vspace);


Scene scene = new Scene(g,700,500);
	stage.setScene(scene);
	stage.setResizable(false);
	stage.show();
	
back.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
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
Search.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		 
		
		FileReader f;
		try {
			f = new FileReader("SignUps.txt");
			
			Scanner s = new  Scanner(f);
						
				while(s.hasNext())
				{
					String ID = searchf.getText();
					Alert a = new Alert(AlertType.INFORMATION);
					
				if( s.next().equals(ID))
				{

					a.setContentText("Name : " +s.next()+"\tFatherName : "+s.next());
					a.show();
					
					
				}
			
		
				
				}
			
			
			
			
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
