package question11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quest11 {
	public static void main(String[] args) throws IOException
	{
	
	
		Scanner br=new Scanner(System.in);
	System.out.println("Enter the number of applications");
	int number=br.nextInt();
	int a[]=new int[number];
	System.out.println("Enter the amount(in crores)");
	for(int i=0;i<number;i++)
	{
		a[i]=br.nextInt();
	}
	
	int temp;
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
	 
	System.out.println("The winning bid is "+a[number-1] +" crores");
	
		

	

}
}
