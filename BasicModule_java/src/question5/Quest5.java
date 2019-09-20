package question5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quest5 {
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
	
int sum=0;
	 for (int i = 0; i < number; i++) 
     {
        sum+=a[i];
     }
	 float avg=sum/number;
	 
	
		
		System.out.println("The average is "+avg);
}
}
