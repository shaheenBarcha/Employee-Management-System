package Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class viewAttendance extends Application{
	
	public void start(Stage stage) throws IOException
	{
		FileReader file = new FileReader("Names.txt");
		Scanner s = new Scanner(file);
		
		
		FileReader file1 = new FileReader("IDss.txt");
		Scanner s1 = new Scanner(file1);
		
		
		
		HBox h = new HBox(70);
		HBox h2 = new HBox(110);
		
		
		Label l1 = new Label();
		l1.setFont(Font.font(20));
		Label l2 = new Label();
		l2.setFont(Font.font(20));
		Label l3 = new Label();
		l3.setFont(Font.font(20));
		Label l4 = new Label();
		l4.setFont(Font.font(20));
		Label l5 = new Label();
		l5.setFont(Font.font(20));
		
		
		
		while(s.hasNext())
		{
			
			String name1 = s.next(),name2 = s.next(),name3 =s.next(),name4 = s.next(),name5 = s.next();
		
			l1.setText(name1);
			l2.setText(name2);
			l3.setText(name3);
			l4.setText(name4);
			l5.setText(name5);
				
		}
		
	
		

		Label c1 = new Label("A");
		Label c2 = new Label("A");
		Label c3 = new Label("A");
		Label c4 = new Label("A");
		Label c5 = new Label("A");
		
		
	while(s1.hasNext())
		{

			
			if(s1.next().equals("0001"))
			{
				c1.setText("P");
				c1.setTextFill(Color.GREEN);
			}

			if(s1.next().equals("0002"))
			{
				c2.setText("P");
				c2.setTextFill(Color.GREEN);
			}
			
			if(s1.next().equals("0003"))
			{
				
				c3.setText("P");
				c3.setTextFill(Color.GREEN);
			}
			if(s1.next().equals("0004"))
			{
				c4.setText("P");
				c4.setTextFill(Color.GREEN);
			}
			String check = s1.next();
	
			if(check.equals("0005"))
			{
				c5.setText("P");
				c5.setTextFill(Color.GREEN);
			}
		
		}
	
	Label lspace = new Label("");
		
		
		h.getChildren().addAll(lspace,l1,l2,l3,l4,l5);
		
		Label lspace2 = new Label("");
		
		h2.getChildren().addAll(lspace2,c1,c2,c3,c4,c5);
		
		
		
		Label vspace = new Label("");
		
		
		Hyperlink signout =  new Hyperlink("SignOut");
		Hyperlink back  = new Hyperlink("Back");
		
		Label hhspace = new Label(" ");
		HBox h3 = new HBox(100);
		h3.getChildren().addAll(hhspace,signout,back);
		
		VBox v = new VBox(50);
		v.getChildren().addAll(vspace,h,h2,h3);
		
		
		
		
		
		
		
		Image image1 = new Image("file:visitor.jpg");
		ImageView iv1 = new ImageView(image1);
		
		
		Group g = new Group();
		g.getChildren().addAll(iv1,v);
		
		
		
		Scene scene = new Scene(g,700,500);
		stage.setScene(scene);
		stage.show();
		
		
		
		signout.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
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
		back.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
		
				AdminLogIn a  = new AdminLogIn();
				try {
					
					a.start(stage);
				} 
				catch (Exception e)
				{
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
