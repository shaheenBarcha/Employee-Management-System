package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ViewDeadline extends Application{
	
	
	public void start(Stage stage) throws IOException
	{
		String file = "Deadline.txt";
		
		FileReader f = new FileReader(file);
		Scanner bf = new Scanner(f);
		
		Text title = new Text("		Deadline");
	
	Text space = new Text(" ");
	TextField dp = new TextField(bf.next());
	
	TextField message = new TextField(bf.next()+bf.nextLine());
	message.setPrefSize(300, 200);
	
	Text Submit = new Text("");
	
	Button back = new Button("Back");
	back.setPrefSize(150, 20);
	HBox h = new HBox(150);
	h.getChildren().addAll(Submit,back);
	
	VBox v = new VBox(20);
	v.getChildren().addAll(dp,message,h);
	
	VBox v1 = new VBox(100);
	v1.getChildren().addAll(title,v);
	
	HBox hspace = new HBox(250);
	hspace.getChildren().addAll(space,v1);
	
	Image image = new Image("file:Deadline2.jpg");
	ImageView iv = new ImageView(image);
	
	Group g = new Group();
	g.getChildren().addAll(iv,hspace);
	
	Scene scene = new Scene(g,700,500);
	stage.setScene(scene);
	stage.show();
		
	back.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			
			EmployeeLoginPage a =new EmployeeLoginPage();
			try {
				a.start(stage);
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
