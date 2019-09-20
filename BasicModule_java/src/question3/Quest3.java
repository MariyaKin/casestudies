package question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quest3 {
	public static void main(String[] args) throws IOException
	{
	
	
		Scanner br=new Scanner(System.in);
	System.out.println("Enter the number of students");
	int number=br.nextInt();
	float a[]=new float[number];
	System.out.println("Enter the heights of students");
	for(int i=0;i<number;i++)
	{
		a[i]=br.nextFloat();
	}
	
	float temp;
	 for (int i = 0; i < number; i++) 
     {
         for (int j = i + 1; j < number; j++) 
         {
             if (a[i] > a[j]) 
             {
                 temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
         }
     }
	System.out.println("The heights in order are");
	for(int i=0;i<number;i++)
	{
		
		System.out.println(+a[i]);
	}
		

	

}
}
