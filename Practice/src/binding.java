
public class binding extends dynamic
{
 
	public static void display()
	{
		System.out.println("displaying from child class");
	}

	public static void main(String[] args)
	{
		dynamic db=new binding();
		db.display();
	}
}
