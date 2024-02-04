package Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.sun.webkit.BackForwardList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FeedBack extends Application{

	public void start(Stage stage) throws IOException
	{
		String file = "Feedback.txt";
		
		FileReader f = new FileReader(file);
		Scanner s = new Scanner(f);
		
		
		HBox h1 = new HBox(100);
		HBox h2 = new HBox(100);
		HBox h4 = new HBox(100);
		HBox h5 = new HBox(100);
		HBox h6 = new HBox(100);
		HBox hspace = new HBox(150);
		VBox v = new VBox(40);
		Text space = new Text(" ");
		Button back = new Button("Back");
		back.setPrefSize(200, 20);
		back.setTextFill(Color.BLACK);
		
		hspace.getChildren().addAll(space,back);
		
		VBox vspace = new VBox(200);
		while(s.hasNext())
		{
		
		Label l1 = new Label("ID and Name \t:\t "+s.nextLine());
		l1.setTextFill(Color.BLACK);
		Label t1 = new Label("Feedback \t : \t"+s.next()+s.nextLine());
		t1.setTextFill(Color.BLACK);
		
		h1.getChildren().addAll(l1,t1);
		
		Label l2 = new Label("ID and Name \t:\t "+s.nextLine());
		l2.setTextFill(Color.BLACK);
		Label t2= new Label("Feedback \t : \t"+s.next()+s.nextLine());
		t2.setTextFill(Color.BLACK);
		
		h2.getChildren().addAll(l2,t2);
		
		Label l3 = new Label("ID and Name \t:\t "+s.nextLine());
		l3.setTextFill(Color.BLACK);
		Label t3 = new Label("Feedback \t : \t"+s.next()+s.nextLine());
		t3.setTextFill(Color.BLACK);
		
		h4.getChildren().addAll(l3,t3);
		
		
		Label l4 = new Label("ID and Name \t:\t "+s.nextLine());
		l4.setTextFill(Color.BLACK);
		Label t4 = new Label("Feedback \t : \t"+s.next()+s.nextLine());
		t4.setTextFill(Color.BLACK);
		
		h5.getChildren().addAll(l4,t4);
		
		Label l5 = new Label("ID and Name \t:\t "+s.nextLine());
		l5.setTextFill(Color.BLACK);
		Label t5 = new Label("Feedback \t : \t"+s.next()+s.nextLine());
		t5.setTextFill(Color.BLACK);
		
		
		h6.getChildren().addAll(l5,t5);
		v.getChildren().addAll(vspace,h1,h2,h4,h5,h6,hspace);	
	}

// to change distance from uper boarder
		
		
		
		VBox v1= new VBox(100);
		
		HBox Hmain = new HBox(100);
		Hmain.getChildren().addAll(v1,v);		
		
		Image image = new Image("file:FB.png");
		ImageView iv = new ImageView(image);
		Group g = new Group();
		
		g.getChildren().addAll(iv,Hmain);

		
				Scene scene =new Scene(g,700,500);
				stage.setScene(scene);
				stage.setResizable(false);
				stage.show();
back.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		AdminLogIn a =  new AdminLogIn() ;
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
