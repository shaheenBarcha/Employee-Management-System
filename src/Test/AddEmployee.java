package Test;

import java.io.File;
import java.io.IOException;

import com.sun.javafx.image.impl.ByteIndexed.Getter;

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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import sun.security.jgss.LoginConfigImpl;

public class AddEmployee extends Application{

	
	
	public void start(Stage stage)
	{
	
		
		Text vspace = new Text(" ");
		
		
		Label name = new Label("Name ");
		TextField namef = new TextField();
		
		HBox h = new HBox(82);
		h.getChildren().addAll(name,namef);
		
		Label Fname = new Label("Father name");
		TextField Fnamef = new TextField();
		HBox h1 = new  HBox(50);
		h1.getChildren().addAll(Fname,Fnamef);
		
		Label Dob = new Label("Date Of Birth");
		DatePicker Dobf = new DatePicker();
		HBox h2 =  new HBox(50);
		h2.getChildren().addAll(Dob,Dobf);
		
		TextField link = new TextField("Please Enter ID");
		
		FileChooser fc = new FileChooser();
		
		//fc.setSelectedExtensionFilter("*.jpg");
	//fc.ExtensionFilter e=new FileChooser().ExtensionFilter("*.txt");
	FileChooser.ExtensionFilter e1223= new FileChooser.ExtensionFilter("only image", "*.jpg","*.png");
	fc.getExtensionFilters().add(e1223);
	
	
		HBox spacing = new HBox(100);
		VBox uploading =  new VBox(20);
		uploading.getChildren().addAll(link);
		spacing.getChildren().addAll(h2,uploading);
		
		
		Label Gender = new Label("Gender");		
		ComboBox genderf = new ComboBox();
		genderf.getItems().addAll("Male","Female","Other");
		HBox h3 = new HBox(100);
		h3.getChildren().addAll(Gender,genderf);
		
		Label Password = new Label("Password");
		PasswordField passwordf = new PasswordField();
		HBox h4 = new HBox(70);
		h4.getChildren().addAll(Password,passwordf);
		
		Button Save = new Button("Save");
		Button Cancel =  new Button("Cancel");
		Cancel.setPrefSize(120, 20);
		Save.setPrefSize(120, 20);
		HBox buttons = new HBox(50);
		buttons.getChildren().addAll(Save,Cancel);
		
		VBox v1 = new VBox(40);
		v1.getChildren().addAll(vspace,h,h1,spacing,h3,h4,buttons);
		HBox hspace = new HBox(100);
		HBox Hmain = new HBox(40);
		Hmain.getChildren().addAll(hspace,v1);
		
		Image image = new Image("file:adde.jpg");
		ImageView iv = new ImageView(image);
		
		Group g = new Group();

		g.getChildren().addAll(iv,Hmain);

		Scene scene =new Scene(g,700,500);
		
		
		
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
Cancel.setOnAction(new EventHandler<ActionEvent>() {
	
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


Save.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
	String details = "";
	String log = "";
	String gender = "";
	String names = "";
	
	
	log += namef.getText()+" ";
	log += passwordf.getText();
	
	names +=namef.getText();
	
	details +=link.getText()+" ";
	details+= namef.getText() +" ";
	details += Fnamef.getText() +" ";
	details +=Dobf.getValue() +"  ";
	details +=genderf.getSelectionModel().getSelectedItem() +"  ";
	details +=passwordf.getText() +"  ";

	
		ConnectionFile cnn  = new ConnectionFile();
	try
	{
		cnn.writetofile(details);
		cnn.writetologinfile(log);
		cnn.writetonamefile(names);
		
		Alert a = new Alert(AlertType.INFORMATION);
		a.setContentText("Account Registered Successfully");
		a.showAndWait();
		if(a.getResult() == ButtonType.OK)
		{
			
			namef.setText(null);
			passwordf.setText(null);
			Dobf.setValue(null);
			Fnamef.setText(null);
			
			
		}
	}
	catch(IOException e)
	{
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
