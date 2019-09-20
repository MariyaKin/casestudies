package question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quest1 {
	public static void main(String[] args) throws IOException
	{
	
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your Name");
	String name=br.readLine();
	System.out.println("Enter your age");
	String age=br.readLine();
	System.out.println("Enter your Degree");
	String degree=br.readLine();
	System.out.println("Enter your Branch");
	String branch=br.readLine();
	System.out.println("Enter your Contact Number");
	String contacNumber=br.readLine();
	System.out.println("Name   :"+name);
	System.out.println("Age   :"+age);
	System.out.println("Degree   :"+degree);
	System.out.println("Branch   :"+branch);
	System.out.println("Contact   :"+contacNumber);
	
	

}
	
}
