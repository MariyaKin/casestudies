package casestudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Case3{
	public static void main(String[] args) throws IOException
	{
	
	int a[]=new int[10];
	String name;
	String address;
	String contact;
	String branch;
	String mail;
	
	String pt;
	String pid;
	
	
	
	
	for(int i=0;i<10;i++)
	{
	a[i]=0;
	}
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String proceed1;
	
	System.out.println("Enter your Name");
	name=br.readLine();
	System.out.println("Enter your Address");
	 address=br.readLine();
	System.out.println("Enter your ContactNumber");
    contact=br.readLine();
	System.out.println("Enter your Branch");
	branch=br.readLine();
	System.out.println("Enter your Email-Id");
	 mail=br.readLine();
	System.out.println("Enter your ProofType");
	 pt=br.readLine();
	System.out.println("Enter your ProofId");
	 pid=br.readLine();
	//System.out.println("Do you want to proceed?(yes/no)");
	//String proceed=br.readLine(); 
	int flag=0;
	int i;
	//if(proceed.equalsIgnoreCase("yes"))
		 
	//{
		
	for( i=0;i<25;i++)
	{
	if(a[i]==0)
	{

	a[i]=i+1;
	flag=1;
	break;
	}
	//}
	
	
	
	}
	if(flag==1)
	{
		System.out.println("Thank you  for registering your id is"+a[i]);
	
	}
	System.out.println("Do you want to continue registration (yes/no)?");
      proceed1=br.readLine(); 
	
      if(proceed1.equalsIgnoreCase("yes"))
      {
	
	
	
		System.out.println("Do you want to update the email id?(yes/no));");
		String proceed2=br.readLine(); 
		if(proceed2.equalsIgnoreCase("yes"))
			 
		{
			System.out.println("Update Email:	");
			
			System.out.println("Enter your Email-Id");
			 mail=br.readLine();
			 System.out.println("Email updated");
			 System.out.println("Your details are as follows");
				
				System.out.println("Name   :"+name);
				System.out.println("Address   :"+address);
				System.out.println("ContatNumber  :"+contact);
				System.out.println("Branch   :"+branch);
				System.out.println("Mail   :"+mail);
				System.out.println("ProofType   :"+pt);
				System.out.println("ProofId   :"+pid);
					
		}
		else if (proceed2.equalsIgnoreCase("no"))
		{
			System.out.println("Your details are as follows");
		
			System.out.println("Name   :"+name);
			System.out.println("Address   :"+address);
			System.out.println("ContatNumber  :"+contact);
			System.out.println("Branch   :"+branch);
			System.out.println("Mail  :"+mail);
			System.out.println("ProofType   :"+pt);
			System.out.println("ProofId   :"+pid);
				
		}
	
		else
		{
			System.out.println("invalid");
		}
      }
		  else if(proceed1.equalsIgnoreCase("no"))
			  
		   {
			  System.out.println("Your details are as follows");
				
				System.out.println("Name   :"+name);
				System.out.println("Address   :"+address);
				System.out.println("ContatNumber  :"+contact);
				System.out.println("Branch   :"+branch);
				System.out.println("Mail  :"+mail);
				System.out.println("ProofType   :"+pt);
				System.out.println("ProofId   :"+pid);
		   }
		  else
			   
			  System.out.println("Invalid");
	
	}
}

	
	

