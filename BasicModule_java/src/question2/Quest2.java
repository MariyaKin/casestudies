package question2;

import java.io.IOException;
import java.util.Scanner;

public class Quest2 {
	public static void main(String[] args) throws IOException
	{
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int number=sc.nextInt();
double sum=0;
int temp=number,r;
int count=0;
while (temp != 0)
{
	 count++;
    temp /= 10;
   
}
temp=number;
while(temp!=0)
{
	r=temp%10;
	sum=sum+Math.pow(r,count);
	temp=temp/10;
	
	
}
if(number==sum)
{
	System.out.println("The given number is  amstrong");	
}
else
{
	System.out.println("The given number is not amstrong");
}
}

	
}
