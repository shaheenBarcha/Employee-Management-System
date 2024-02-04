package Test;

import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.util.Scanner;

import javax.swing.plaf.synth.Region;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis.DefaultFormatter;
import javafx.scene.control.Button; 
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class MyProfileAdmin extends Application {
	
	public void start(Stage stage) throws FileNotFoundException 
	{
		
		FileReader file = new FileReader("Comments.txt");
		Scanner s = new Scanner(file);
		
		
	String Dob = "20-March-2010";
	String name = "Shaheen";
	String des = "Admin";
	String Gender = "Male";
	String Fname = "Amir";
	String Email =" Shaheenbarcha@gmail.com";

	Label lemain = new Label(Email);
	lemain.setFont(javafx.scene.text.Font.font(10));
	
	Image image  = new Image("file:Admin.png");
	ImageView iv = new ImageView(image);
	iv.setFitWidth(130);
	iv.setFitHeight(120);
	VBox v = new VBox(10);
	v.getChildren().addAll(iv,lemain);
	
	Label tspace = new Label("");
	
	VBox v1 = new VBox(50);
	v1.getChildren().addAll(tspace,v);
	
	Label lname = new Label("Name :			 "+name);
	lname.setFont(javafx.scene.text.Font.font(11));
	lname.setTextFill(Color.BROWN);
	
	Label lfname = new Label("Father name :		"+Fname);
	lfname.setFont(javafx.scene.text.Font.font(11));
	lfname.setTextFill(Color.BROWN);
	

	
	Label ldes = new Label("Desgination : 		"+des);
	ldes.setFont(javafx.scene.text.Font.font(11));
	ldes.setTextFill(Color.BROWN);
	
	Label lgen = new Label("Gender : 			"+Gender);
	lgen.setFont(javafx.scene.text.Font.font(11));
	lgen.setTextFill(Color.BROWN);
	

	Label lID = new Label("ID : 				 42193");
	lID.setFont(javafx.scene.text.Font.font(11));
	lID.setTextFill(Color.BROWN);

Hyperlink signout = new Hyperlink("SignOut");
signout.setTextFill(Color.ALICEBLUE);
Hyperlink back = new Hyperlink("Back");
back.setTextFill(Color.ALICEBLUE);

HBox hyp = new HBox(30);
hyp.getChildren().addAll(signout,back);
	
	VBox v2 = new VBox(20);
	v2.getChildren().addAll(v1,lname,lfname,ldes,lgen,lID,hyp);

	VBox vcom = new VBox(20);
	
	Button cancel = null;
	
	
	while(s.hasNext())
{
	
	
	Label Hspace = new Label("");
	
	Label visitor = new Label("Visitor's Comments");
	visitor.setPrefSize(200, 20);
	
	TextField email = new TextField(s.next());
	email.setPrefSize(100, 20);
	
	TextField message = new TextField(s.nextLine());
	message.setPrefSize(300, 300);
	
	cancel = new Button("Back");
	cancel.setPrefSize(300, 20);

	
	
	vcom.getChildren().addAll(Hspace,visitor,email,message,cancel);
	

	
	
	
	
	
	
}

Label Hspace1 = new Label("");
HBox h1= new HBox(100);
	h1.getChildren().addAll(Hspace1,v2,vcom);
	

	
	
	Image im = new Image("file:ProfileBG.jpg");
	ImageView ivv = new ImageView(im);
	
	Group g = new Group();
	g.getChildren().addAll(ivv,h1);
	
	
	
	Scene scene = new Scene(g,700,500);
	stage.setScene(scene);
	stage.setResizable(false);
	stage.show();
	
back.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent arg0) {
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

cancel.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent arg0) {

		
		AdminLogIn a = new AdminLogIn();
		try {
			a.start(stage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
});

signout.setOnAction(new EventHandler<ActionEvent>() {
	
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
