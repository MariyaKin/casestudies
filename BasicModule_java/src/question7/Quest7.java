package question7;


import java.io.IOException;
import java.util.Scanner;

public class Quest7 {
	public static void main(String[] args) throws IOException
	{
	
	
		Scanner br=new Scanner(System.in);
	System.out.println("Enter the number alphabets in your name");
	int number=br.nextInt();
	int combinations=1;
	for(int i=1;i<=number;i++)
	{
		combinations*=i;
		
	}
	 
	 
	
		
		System.out.println("The number of combination is "+combinations);
}
}
