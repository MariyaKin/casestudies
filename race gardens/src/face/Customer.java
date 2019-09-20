package face;

public class Customer
{
	String name;
	String address;
	String contacNumber;
	String email;
	String prooftype;
	String proofid;
	public Customer(String name,String address,String contacNumber,String email,String prooftype,String proofid)
	{
		this.name=name;
		this.address=address;
		this.contacNumber=contacNumber;
		this.email=email;
		this.proofid=proofid;
		this.prooftype=prooftype;
		
}
	void register(String name,String address,String contacNumber,String email,String prooftype	,String proofid)
	{
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.contacNumber);
		System.out.println(this.email);
		System.out.println(this.prooftype);
		System.out.println(this.proofid);
		
		
		
		
		
	}

}
