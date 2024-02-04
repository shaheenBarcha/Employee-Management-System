package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
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
import javafx.stage.Stage;

public class ReqLeave extends Application{

	
	public void start(Stage stage) throws FileNotFoundException
	{
		
		
		FileReader file = new FileReader("ReqtoLeave.txt");
		Scanner s = new Scanner(file);
		
		
				
				
				
Label name = new Label("Name and ID :");
TextField namef = new TextField(s.nextLine());
namef.setPrefSize(200, 20);

HBox h1 = new HBox(20);
h1.getChildren().addAll(name,namef);

TextField message =  new TextField(s.next()+s.nextLine());
message.setPrefSize(300, 300);

Button back = new Button("Back");
back.setPrefSize(300, 20);


HBox h = new HBox(30);
h.getChildren().addAll(back);

Label vspace = new Label("");

VBox v = new VBox(20);
v.getChildren().addAll(vspace,h1,message,h);

Label hspace = new Label("");

HBox h2 = new HBox(200);
h2.getChildren().addAll(hspace,v);

Image image = new Image("file:Management1.jpg");
ImageView iv = new ImageView(image);


Group g = new Group();
g.getChildren().addAll(iv,h2);


Scene scene = new Scene(g,700,500);
stage.setScene(scene);
stage.show();

back.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub

Requests r= new Requests();
r.start(stage);
	
		
	}
});
			
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		launch(args);
	}

}
