package question12;


import java.io.IOException;
import java.util.Scanner;

public class Quest12 {
	public static void main(String[] args) throws IOException
	{
	
	
		Scanner br=new Scanner(System.in);
	System.out.println("Enter the number of players");
	int number=br.nextInt();
	int a[]=new int[number];
	System.out.println("Enter the number of fouls made by each player");
	for(int i=0;i<number;i++)
	{
		a[i]=br.nextInt();
	}
	
	int lowest=a[0];
	int no = 0;
	 for (int i = 0; i < number; i++) 
     {
        if(a[i]<lowest)
        {
        	lowest=a[i];
        	no=i;
        }
     }
	 
	System.out.println("The eligible player is player no" +no+ "(" +lowest+ " fouls)");
	
		

	

}
}
