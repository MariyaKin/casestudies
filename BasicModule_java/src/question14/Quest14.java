package question14;


import java.io.IOException;
import java.util.Scanner;

public class Quest14 {
	

	public static void main(String[] args) throws IOException
	{
	
	
		Scanner br=new Scanner(System.in);
	
	System.out.println("Enter the value of n");
	int number=br.nextInt();
	System.out.println("Enter the value of r");
	int r=br.nextInt();
	long n1=1,r1=1,n2=0,n3=1,a=0,i;
	
	 for ( i = 1; i <= number; i++) 
     {
       n1=n1*i;
     }	
	 for ( i = 1; i <= number; i++) 
     {
       r1=r1*i;
     }	
	

	n2=number-r;
	 for ( i = 1; i <= number; i++) 
     {
       n3=n3*i;
     }	
	
	
	a=(n1/(r1*n3));
	
	 System.out.println("The sum is "+a);
		
	
	
		

	

}
}
