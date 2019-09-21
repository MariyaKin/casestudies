package casestudy4;

import java.io.*;

public class Case4 {
	static int id[]=new int[10];
	static String name[]=new String[10];
	static String adres[]=new String[10];
	static String contact[]=new String[10];
	static String branch[]=new String[10];
	static String mail[]=new String[10];
	static String pt[]=new String[10];
	static String pid[]=new String[10];
	static String proceed1;
	
	public static void main(String[] args) throws IOException
	{
		
		
		for(int i2=0;i2<10;i2++)
		{
		id[i2]=0;
		}
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		int count=0;
		System.out.println("Registration");

		do
		{
			count++;
		System.out.println("Enter your Name");
		name[i]=br.readLine();
		System.out.println("Enter your Address");
		 adres[i]=br.readLine();
		System.out.println("Enter your ContactNumber");
	    contact[i]=br.readLine();
		System.out.println("Enter your Branch");
		branch[i]=br.readLine();
		System.out.println("Enter your Email-Id");
		 mail[i]=br.readLine();
		System.out.println("Enter your ProofType");
		 pt[i]=br.readLine();
		System.out.println("Enter your ProofId");
		 pid[i]=br.readLine();
		
			int flag=0;
			
			//if(proceed.equalsIgnoreCase("yes"))
				 
			//{
				
			for( i=0;i<10;i++)
			{
			if(id[i]==0)
			{

			id[i]=i+1;
			flag=1;
			break;
			}
			//}
			
			
			
			}
			if(flag==1)
			{
				System.out.println("Thank you  for registering your id is"+id[i]);
			
			}
			i++;
			
			System.out.println("Do you want to continue registration (y/n)?");
		      proceed1=br.readLine(); 
			}while(proceed1.equalsIgnoreCase("y"));
		Case4 ob=new Case4();
		ob.ViewCustomers(count);
	}

	private void ViewCustomers(int count) {
		System.out.println("Customers list\n The registered customers are:");
		
		
		System.out.println("Customer ID:  CustomerName");
		for( int s=0;s<count;s++)
		{
			System.out.println(+id[s]+"                "+name[s]);
		}
		
		System.out.println("Thank You");
	}// TODO Auto-generated method stub
		
	}

