package question6;


import java.io.IOException;
import java.util.Scanner;

public class Quest6 {
	public static void main(String[] args) throws IOException
	{
	
	
		Scanner br=new Scanner(System.in);
	System.out.println("Enter the number of students");
	int number=br.nextInt();
	int a[]=new int[number];
	System.out.println("Enter the marks of students");
	for(int i=0;i<number;i++)
	{
		a[i]=br.nextInt();
	}
	int count=0;
	 for (int i = 0; i < number; i++) 
     {
		 
		 
		if(a[i]<50)
		{
			count++;
		}
		 
		 
     }
	 
	 
	
		
		System.out.println("Number of students appearing for retest is "+count);
}
}
