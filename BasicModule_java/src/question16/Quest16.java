package question16;


import java.io.IOException;
import java.util.Scanner;

public class Quest16 {
	public static void main(String[] args) throws IOException
	{
	
	
		Scanner br=new Scanner(System.in);
	
	System.out.println("Enter the number of vehicles");
	int number=br.nextInt();
	int a[]=new int[number];
	System.out.println("Enter the fare collected for each vehicles");
	for (int i = 0; i <number; i++) 
    {
	
a[i]=br.nextInt();
    }
	int countheavy=0,countlght=0;
	for (int i = 0; i <number; i++) 
    {
	if(a[i]>50)
	{
		countheavy++;
    }
	else if(a[i]<50 && a[i]>0)
	{
		countlght++;
	}
	
	
	 
       
     }
	 System.out.println("Number of heavy vehicles"+ countheavy+" and the number of light weight vehicles is "+countlght);
		
	
	
		

	

}
}
