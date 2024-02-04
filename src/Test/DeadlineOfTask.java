package Test;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DeadlineOfTask extends Application {
	
	String deadline;
	
	public void start(Stage stage)
	{
		Text title = new Text("		Deadline");
		
		Text space = new Text(" ");
		DatePicker dp = new DatePicker();
		TextField message = new TextField("Please Input Any message regarding Deadline");
		message.setPrefSize(150, 150);
		
		Button Submit = new Button("Submit");
		Submit.setPrefSize(80, 20);
		Button back = new Button("Back");
		back.setPrefSize(80, 20);
		HBox h = new HBox(20);
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
		
		Submit.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String details = "";
				details+=dp.getValue()+"\n";
				details+= message.getText();
				
				ConnectionFile cnn = new ConnectionFile();
				try {
					cnn.writeintodeadline(details);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Alert a = new Alert(AlertType.INFORMATION);
				a.setContentText("Information Submitted");
				a.show();
			}
		});
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
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch(args);
	}

}
