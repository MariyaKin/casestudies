package question10;

import java.io.IOException;
import java.util.Scanner;

public class Quest10 {
	
	
		public static void main(String[] args) throws IOException
		{
		
		
			Scanner br=new Scanner(System.in);
		System.out.println("Enter the number of bowlers");
		int number=br.nextInt();
		float a[]=new float[number];
		float b[]=new float[number];
		float c;
	
		System.out.println("Enter the runs conceded by the bowlers");
		for(int i=0;i<number;i++)
		{
			a[i]=br.nextInt();
		}
		System.out.println("Enter the number of balls for each bowler");
		for(int i=0;i<number;i++)
		{
			b[i]=br.nextInt();
		}
		for(int i=0;i<number;i++)
		{
			
		c=b[i]/6;
		a[i]=a[i]/c;
		
		}
		System.out.println("Economy of the bowlers is");
		for(int i=0;i<number;i++)
		{
			System.out.println(""+a[i]);
		}
		float economyavg=0;
		for(int i=0;i<number;i++)
		{
			economyavg+=a[i];	
		}
		economyavg/=number;
		System.out.println("The overall economy of the teanm is"+economyavg);  
		   
		int count=0;
		for(int i=0;i<number;i++)
		{
		if(a[i]>economyavg)	
		{
			count++;
		}
		}
		
		
		
	 
	 
		  System.out.println("The number of bowlers eligible are"+count);  
	   
		}
}
