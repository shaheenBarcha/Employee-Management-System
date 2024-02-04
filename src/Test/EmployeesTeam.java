package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.scene.control.Label;

public class EmployeesTeam  {
	String emp1;
	String emp2;
	String emp3;
	String emp4;
	String emp5;

	/* public void setEmp1(String employ1) {
		this.emp1 = employ1;
	}
	
	public String getEmp1() {
		return emp1;
	}

	public void setEmp2(String emp2) {
		this.emp2 = emp2;
	}
	public String getEmp2() {
		return emp2;
	}
	
	public void setEmp3(String emp3) {
		this.emp3 = emp3;
	
	}	
	public String getEmp3() {
		return emp3;
	}
	
	public void setEmp4(String emp4) {
		this.emp4 = emp4;
	}
	public String getEmp4() {
		return emp4;
	}

	public void setEmp5(String emp5) {
		this.emp5 = emp5;
	}
	
	public String getEmp5() {
		return emp5;
	}
*/
	public static void main(String args[]) throws FileNotFoundException
	{
		
		File file = new File("Names.txt");
		Scanner s = new Scanner(file);		
		
		System.out.println(s.next());
		String emp1 =  s.next();
		String emp2 = s.next();
		String emp3 = s.next();
		String emp4 =s.next();
		String emp5 = s.next();
		
		System.out.println(emp1);
		
		
		
	}
}
