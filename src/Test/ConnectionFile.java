package Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConnectionFile {
	String filename= "SignUps.txt";
	String filename1= "Login.txt";
	String filename2 = "Names.txt";
	String task = "AssignedTask.txt";
	String deadline = "Deadline.txt";
	String feed = "Feedback.txt";
	Scanner f;

	public void writetofile(String d) throws IOException
	{
		FileWriter f= new FileWriter(filename,true);
		f.flush();
		f.write(d);
		f.write("\n");
		f.close();
		
	}
	public void Myprofile(String d) throws IOException
	{
		
		String profile = "Logins.txt";
		
		
	FileWriter f = new FileWriter(profile);
	
	f.write(d);
	f.close();
		
		
	}
	public void AssignTaskFile(String d) throws IOException
	{
		FileWriter f= new FileWriter(task);

		f.write(d);
		f.write("\n");
		f.close();
		
	}
	public void writeintodeadline(String d) throws IOException
	{
		FileWriter f = new FileWriter(deadline);
		
		f.write(d);
		f.write("\n");
		f.close();
		
	}
	public void Reqtoleave(String d) throws IOException
	{
		String file = "ReqtoLeave.txt";
		FileWriter f = new FileWriter(file);
		BufferedWriter bf = new BufferedWriter(f);
				
		bf.write(d);
		bf.write("\n");
		bf.close();
		
	}
	
	
	
	public void writeintofeedback(String d) throws IOException
	
	{
	
	FileWriter f = new FileWriter(feed,true);
	
	
	f.write(d);
	f.write("\n");
	f.close();
		
		
	}
	public void Reqtojoin(String d) throws IOException
	{
		String file = "ReqtoJoin.txt";
		
		FileWriter f = new FileWriter(file);
		BufferedWriter bf = new BufferedWriter(f);
		
		bf.write(d);
		bf.write("\n");
		bf.close();
		
	}
	public void writetonamefile(String d) throws IOException
	{
		FileWriter f= new FileWriter(filename2,true);
		f.write(d);
		f.write("\n");
		f.close();
		
	}
	
	
	
	public void writetologinfile(String d) throws IOException
	{
		FileWriter f= new FileWriter(filename1,true);
		
		f.write(d);
		f.write("\n");
		f.close();
		
	}
	
	public void openfile()
	{
		try {
			
			f=new Scanner(new File(filename1));
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public boolean logintofile(String tempn,String tempp)
	{
		boolean status=false;
		String n=tempn;
		String p=tempp;	
		while(f.hasNext())
		{
			String a=f.next();
			String b= f.next();
			
			if(a.equalsIgnoreCase(n) && b.equals(p))
			{
				status=true;
			}
		}
		return status;
	}

	public void fileclose()
	{
		f.close();
	}
	
	public static void main(String[] args) 
	{

		
	}
	}