package Test;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 

public class AskingID extends Application{

	public void start(Stage stage)
	{
	Text tspace1 =new  Text(" ");
	
TextField searchf = new TextField("Enter ID Here");
searchf.setPrefSize(265, 20);

	
	HBox h2 = new HBox(250);
	h2.getChildren().addAll(tspace1,searchf);

Text tspace = new Text(" ");
Button back = new Button("Next");
back.setPrefSize(265, 20);
 
HBox h3 = new HBox(20);
h3.getChildren().addAll(back);

HBox h = new HBox(250);
h.getChildren().addAll(tspace,h3);

VBox v = new VBox(30);
v.getChildren().addAll(h2,h);

VBox v1 = new VBox();


VBox vspace = new VBox(100);
vspace.getChildren().addAll(v1,v);
	
Image image = new Image("file:AskingID.jpg");
ImageView iv = new ImageView(image);

Group g = new Group();
g.getChildren().addAll(iv,vspace);


Scene scene = new Scene(g,700,500);
	stage.setScene(scene);
	stage.setResizable(false);
	stage.show();
	
back.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		try {
			
			FileWriter file = new FileWriter("IDs.txt");
			FileWriter f = new FileWriter("IDss.txt",true);
			
			BufferedWriter bf = new BufferedWriter(file);
			
			BufferedWriter bw = new BufferedWriter(f);
			
			
			FileReader fileread = new FileReader("SignUps.txt");
			Scanner s = new Scanner(fileread);
			
			while(s.hasNext())
			{
				String ID = searchf.getText();		
				String idread = s.next();
				
				if(ID.equals(idread))
				{
					bf.write(ID);
					bf.close();
					
					bw.write(ID+" ");
					bw.close();
					
					EmployeeLoginPage e = new EmployeeLoginPage();
					e.start(stage);	
					
				}				
			}
			
			
			
		} catch (IOException e) {
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
