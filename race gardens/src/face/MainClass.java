package face;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass
{
	String name;
	String address;
	String contacNumber;
	String email;
	String prooftype;
	String proofid;
	
	public MainClass(String name,String address,String contacNumber,String email,String prooftype,String proofid)
	{
		this.name=name;
		this.address=address;
		this.contacNumber=contacNumber;
		this.email=email;
		this.proofid=proofid;
		this.prooftype=prooftype;
		
}
	public static void main(String[] args) throws IOException
	{
String name;
String address;
String contacNumber;
String email;
String prooftype;
String proofid;
//Scanner sc=new Scanner(System.in);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
name=br.readLine();
address=br.readLine();
contacNumber=br.readLine();
prooftype=br.readLine();

proofid=br.readLine();
email=br.readLine();
MainClass customer1=new MainClass(name,address,contacNumber,email,prooftype,proofid);
Customer c1=new Customer(name,address,contacNumber,email,prooftype,proofid);
c1.register(name,address,contacNumber,email,prooftype,proofid);
	}




	}


