package question15;


import java.io.IOException;
import java.util.Scanner;

public class Quest15 {
	public static void main(String[] args) throws IOException
	{
	
	
		Scanner br=new Scanner(System.in);
	
	System.out.println("Enter a number");
	int number=br.nextInt();
	int temp=number;
	int a[]=new int[number];
	for(int i=0;i<number;i++)
	{
	if(number%i==0)
		
	{
	a[i]=br.nextInt();
	}
	}
	
		
	
	System.out.println("The divisors of the number are");

	for(int i=0;i<number;i++)
	{
		System.out.println(""+a[i]);
	}
	
	
	int sum=0;
	for(int i=0;i<number;i++)
	{
		sum+=a[i];
	}
	System.out.println("The sum of the divisors are"+sum);
	if(temp==sum)
	{
		System.out.println("It is a perfect number");
	}
	else
	{
		System.out.println("It is not a perfect number");
	
	}
	
		

	

}
}
