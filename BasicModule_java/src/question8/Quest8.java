package question8;


import java.io.IOException;
import java.util.Scanner;

public class Quest8 {
	public static void main(String[] args) throws IOException
	{
	
	
		Scanner br=new Scanner(System.in);
	System.out.println("Enter a number");
	int number=br.nextInt();
	int f1=0,f2=1,f3;
	System.out.println("The fibonacci series is \n"+f1);
	System.out.println(""+f2);
	

	for(int i=1;i<=number;i++)
	{
	f3=f1+f2;
	
		
	System.out.println(""+f3);
	f1=f2;
	f2=f3;
	
		
	}
	 
	 
	
		
		}
}
