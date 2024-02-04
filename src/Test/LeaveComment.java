package Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
import javafx.stage.Stage;


public class LeaveComment extends Application
{

	public void start(Stage stage) throws IOException
	{
		FileWriter file = new FileWriter("Comments.txt");
		BufferedWriter bf = new BufferedWriter(file);		
		
		Label email = new Label("Email Address ");
		TextField emailf = new TextField("Your Email");
		emailf.setPrefSize(400, 20);
		
		HBox h = new HBox(20);
		h.getChildren().addAll(email,emailf);
		
		TextField message = new TextField("Write Your Message here!");
		message.setPrefSize(400, 400);
		
		Button submit = new Button("Send");
		submit.setPrefSize(245, 20);
		
		Button back = new Button("back");
		back.setPrefSize(245, 20);
		
		HBox hbutton =  new HBox(10);
		hbutton.getChildren().addAll(submit,back);
		
		Label  lspace = new Label("");
		
		VBox v = new VBox(5);

		v.getChildren().addAll(lspace,h,message,hbutton);
		
		Label hspace = new Label("");
		
		HBox h1 = new HBox(100);
		h1.getChildren().addAll(hspace,v);
		
		
		Image image = new Image("file:visitor.jpg");
		ImageView iv = new ImageView(image);
		
		Group g = new Group();
		g.getChildren().addAll(iv,h1);
		
		
		Scene scene =new Scene(g,700,500);
		stage.setScene(scene);

		stage.show();
		
		
		submit.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String emailff  = emailf.getText();
				String messageff = message.getText();
				
				try {
					bf.write(emailff);
					bf.write(" ");
					bf.write(messageff);
					bf.close();
					
					Alert a = new Alert(AlertType.INFORMATION);
					a.setContentText("Your Comment Has been Submitted to Admin");
					a.showAndWait();
					if(a.getResult() == ButtonType.OK)
					{
						
						AddingImage ad = new AddingImage();
						try {
							ad.start(stage);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		
		back.setOnAction(new EventHandler<ActionEvent>() {
		
			
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
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		launch(args);
	}
	

}
