package Test;

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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SearchMyProfile extends Application {
	
	public void start(Stage stage) throws FileNotFoundException
	{
		
		String fname = "IDs.txt";
		String fname1 = "SignUps.txt";
		
		FileReader file = new FileReader(fname);
		Scanner s = new Scanner(file);
		
		FileReader file1 = new FileReader(fname1);
		Scanner s1 = new Scanner(file1);
				
		String loginss = s.next();
		
		HBox h = new HBox(82);
		HBox h1 = new  HBox(50);
		HBox h2 =  new HBox(50);
		HBox spacing = new HBox(100);
		VBox uploading =  new VBox(20);
		HBox h3 = new HBox(80);
		HBox h4 = new HBox(70);
		HBox buttons = new HBox(120);
		HBox hspace = new HBox(100);
		HBox Hmain = new HBox(40);
		
		
		Button Cancel = null;
		while(s1.hasNext())
		{
			String got = s1.next();
			if(loginss.equals(got))
			{
				
				
				Text vspace = new Text(" ");
				
				
				Label name = new Label("Name ");
				TextField namef = new TextField(s1.next());
				h.getChildren().addAll(name,namef);
				
				
				Label Fname = new Label("Father name");
				TextField Fnamef = new TextField(s1.next());
				h1.getChildren().addAll(Fname,Fnamef);
				
				Label Dob = new Label("Date Of Birth");
				TextField Dobf = new TextField(s1.next());
				h2.getChildren().addAll(Dob,Dobf);
				
				TextField link = new TextField("ID : \t\t"+got);
				uploading.getChildren().addAll(link);
				spacing.getChildren().addAll(h2,uploading);
		
//////Done 
				Label Gender = new Label("Gender");		
				TextField genderf = new TextField(s1.next());

				h3.getChildren().addAll(Gender,genderf);
				
				Label Password = new Label("Password");
				TextField passwordf = new TextField(s1.next());
				h4.getChildren().addAll(Password,passwordf);
				
				Label Save = new Label("");
				Cancel =  new Button("Back");
				Cancel.setPrefSize(150, 20);
				
				buttons.getChildren().addAll(Save,Cancel);
				
				VBox v1 = new VBox(40);
				v1.getChildren().addAll(vspace,h,h1,spacing,h3,h4,buttons);
				Hmain.getChildren().addAll(hspace,v1);

			
			
			
			
			
			
			}
			
		}
		
		Image image = new Image("file:Myy.jpg");
		ImageView iv = new ImageView(image);
		
		Group g = new Group();
		g.getChildren().addAll(iv,Hmain);
		
		Scene scene = new Scene(g,700,500);
		stage.setScene(scene);
		stage.show();
		
		
		Cancel.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				EmployeeSearch e = new EmployeeSearch();
				e.start(stage);
				
				
			}
		});
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		launch(args);
	}

}
