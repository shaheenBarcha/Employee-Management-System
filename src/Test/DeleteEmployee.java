package Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DeleteEmployee extends Application{

	public static Scanner  x;
	
	public void start(Stage stage) throws FileNotFoundException
	{
		
		
		String file = "Names.txt";
		
		FileReader f = new FileReader(file);
		Scanner s = new Scanner(f);
		
		
		String Emp1 = null,Emp2 = null,Emp3 = null,Emp4 = null ,Emp5 = null;
		
		while(s.hasNext())
		{
		 Emp1 = s.next();
		 Emp2 = s.next();
		
		 Emp3 = s.next();
		 Emp4 = s.next();
		
		 Emp5 = s.next();

		}
		Text Team = new Text("Team");
		
		CheckBox c = new CheckBox(Emp1);
		c.setTextFill(Color.RED);
		
		CheckBox c1 = new CheckBox(Emp2);
		c1.setTextFill(Color.RED);

		CheckBox c2 = new CheckBox(Emp3);
		c2.setTextFill(Color.RED);

		
		CheckBox c3 = new CheckBox(Emp4);
		c3.setTextFill(Color.RED);

		CheckBox c4 = new CheckBox(Emp5);
		c4.setTextFill(Color.RED);


		Label space = new Label(" ");
		
		Button delete = new Button("Delete");
		delete.setPrefSize(100, 20);
		delete.setTextFill(Color.RED);
		Button cancel = new Button("Cancel");
		cancel.setPrefSize(100, 20);
		
		VBox v1 = new VBox();
		VBox v2 = new VBox(10);
		v2.getChildren().addAll(space,Team,c,c1,c2,c3,c4,delete,cancel);
		
		HBox h1 = new HBox(200);
		h1.getChildren().addAll(v1,v2);
		
		Image image = new Image("file:SelectTeam.jpg");
		ImageView iv = new ImageView(image);
		
		Group g = new Group();
		g.getChildren().addAll(iv,h1);
		
		Scene scene = new Scene(g,700,500);
		stage.setScene(scene);
		stage.show();
		
		
		delete.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			if(c.isSelected() || c1.isSelected() || c2.isSelected() || c3.isSelected() || c4.isSelected())
				
			{
				
				Alert a = new Alert(AlertType.CONFIRMATION);
				a.setContentText("Are you sure to delete?");
				a.showAndWait();
				/*
				if( a.getResult() == ButtonType.OK)
				{
					String ID = "";
					if(c.isSelected())
					{
						String name1 = c.getText();
						ID = "0001";
						
					}
					if(c1.isSelected())
					{
						String name2 = c1.getText();
						ID = "0002";
					}
					if(c2.isSelected())
					{
						String name3 = c2.getText();
						ID = "0003";
								
					}
					if(c3.isSelected())
					{
						String name4 = c3.getText();
						ID = "0004";
						
					
					}
					if(c4.isSelected())
					{
						String name5 = c4.getText();
						ID = "0005";
					}
					
					
					String filepath = "SignUps.txt";
					
					File OldFile = new File(filepath);
					
					String temp = "Temp.txt";
					
					File newFile = new File(temp);
					
					String Id = "";
					
					String name = "";
					
					String fname = "";
					
					String Dob = "";
					
					String gender = "";
					
					try
					{
						FileWriter fw = new FileWriter(temp);
						
						BufferedWriter bw = new BufferedWriter(fw);
						
						PrintWriter pw = new PrintWriter(bw);
						
						x = new  Scanner(new File(filepath));
						x.useDelimiter(" ");
						x.useDelimiter("\n");
						while(x.hasNext())
						{
							Id = x.next();
							name = x.next();
							fname = x.next();
							Dob = x.next();
							gender = x.next();
							
							if(!Id.equals(ID))
							{
								pw.print(Id+" "+name+" "+fname+" "+Dob+" "+gender+" ");
							}
					
							
						}
						x.close();
						pw.close();
						OldFile.delete();
						File dump = new File(filepath);
						newFile.renameTo(dump);						
						
					}
					catch(Exception e)
					{
						e.printStackTrace();
						
					}
					
					
					
				}*/
					
				
			}
						
			
			
			}
		});
		
		cancel.setOnAction(new EventHandler<ActionEvent>() {
			
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
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
