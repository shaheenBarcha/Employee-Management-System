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
import javafx.scene.control.ButtonType;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AddingImage extends Application {
	
	
	
public void start(Stage stage) throws Exception
{
	
	String Admin = "Shaheen";
	String pass = "Admin";
	
	Label UserName = new Label("Username");
	UserName.setTextFill(Color.ANTIQUEWHITE);
	TextField tf1 = new TextField();
	tf1.setAlignment(Pos.BASELINE_CENTER);
	Label Password = new Label("Password");
	Password.setTextFill(Color.ANTIQUEWHITE);
	PasswordField pf = new PasswordField();
	pf.setAlignment(Pos.BASELINE_CENTER);
	
	VBox v = new VBox(10);
	
	
	Button SignIn = new Button("Sign In");
	SignIn.setPrefSize(100, 20);
	
	Hyperlink comment = new Hyperlink("Leave a comment");
	comment.setTextFill(Color.WHITE);
	
	v.getChildren().addAll(UserName,tf1,Password,pf,SignIn,comment);
	v.setAlignment(Pos.CENTER);

	
	GridPane g1 = new GridPane();
	 g1.add(v, 3, 6);
	 
	 g1.setVgap(25);

		Label lspace = new Label("");
		
		HBox hh = new HBox(250);
		hh.getChildren().addAll(lspace,g1);
		
	 
	 
		Image image = new Image("file:MainLog.jpg");
		ImageView iv = new ImageView(image);
	
		Group g = new Group();
	

	

		g.getChildren().addAll(iv,hh);

			Scene scene =new Scene(g,700,500);
			
	stage.setScene(scene);
	stage.setResizable(false);
	stage.show();
	
	comment.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
	LeaveComment a = new LeaveComment();
	try {
		a.start(stage);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
	});
	SignIn.setOnAction(new EventHandler<ActionEvent>() {
		
	
		
		@Override
		public void handle(ActionEvent arg0) {
			

			ConnectionFile cnn= new ConnectionFile();			
			cnn.openfile();
			Boolean check = false;
			
			String uname = tf1.getText();
			String Pass = pf.getText();
			
			String in = "";
			in+=uname+"";
		

			try {
				
				
				cnn.Myprofile(in);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			boolean ans=cnn.logintofile(uname, Pass);
			if(ans == true )
			{
			AskingID a = new AskingID();
			a.start(stage);
			}
		else if (tf1.getText().equalsIgnoreCase(Admin) || tf1.getText().equalsIgnoreCase("Admin") && pf.getText().equals(pass))
			 {

					AdminLogIn ad = new AdminLogIn();
					try {
						ad.start(stage);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 check = true;
			 }
			
			 else
			 
			 	{
				 
				Alert a = new Alert(AlertType.WARNING);
				a.setContentText("WrongPassword Or User name");
				a.showAndWait();
			
			
			if(a.getResult() == ButtonType.OK)
			
			{
				
				tf1.setText(null);
				pf.setText(null);
				
				
			}
			
			 	}

			cnn.fileclose();
			
		
		}
		});
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch(args);
	}



}