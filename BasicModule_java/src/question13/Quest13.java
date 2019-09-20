package question13;


import java.io.IOException;
import java.util.Scanner;

public class Quest13 {
	public static void main(String[] args) throws IOException
	{
	
	
		Scanner br=new Scanner(System.in);
	
	System.out.println("Enter a number");
	int number=br.nextInt();
	int sum=0;
	if(number<0)
	{
		System.out.println("Enter a number");
		 number=br.nextInt();
	}

	
	
	
	 for (int i = 1; i <= number; i++) 
     {
       sum+=i;
     }
	 System.out.println("The sum is "+sum);
		
	
	
		

	

}
}
